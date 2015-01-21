package streaming;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileDataWriter implements WriteIO{
	private String destinationFile;

	public FileDataWriter(String destination) {
		this.destinationFile = destination;
	}

	public void write() {
		try {
			BufferedWriter file = new BufferedWriter(new FileWriter(
					destinationFile));
			file.write("Hello from SQLI");
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
