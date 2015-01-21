

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class FileDataCalculation implements ReadIo {
	private String source;
	private DataInputStream file;

	public FileDataCalculation(String source) {
		this.source = source;
	}

	@Override
	public void openFile() throws IOException {
		InputStream input = null;
		input = new FileInputStream(source);
		file = new DataInputStream(input);
	}

	public int calculateTotal() throws IOException {
		int total=0;
//			total+=file.readInt();
		System.out.println("total"+total);
		return total;
	}
	

	@Override
	public void read() {

	}

	@Override
	public void closeFile() {
		try {
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
