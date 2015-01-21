package streaming;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileDataWriter implements WriteIO {
	private String destinationFile;
	BufferedWriter file;

	public FileDataWriter(String destination) {
		this.destinationFile = destination;
	}

	public void write() {
		try {
			file.write("Hello from SQLI");
			file.newLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void openFile() {
		try {
			FileWriter destinationFileWriter = new FileWriter(destinationFile);
			file = new BufferedWriter(destinationFileWriter);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void closeFile() {

		try {
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
