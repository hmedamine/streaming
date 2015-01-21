package streaming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDataReader implements ReadIo {
	private String source;
	private BufferedReader file;

	public FileDataReader(String source) {
		this.source = source;
	}

	public void read() {
		try {
			String line;
			while ((line = file.readLine()) != null) {
				System.out.println(line);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void openFile() {
		try {
			FileReader sourceFileWriter = new FileReader(source);
			file = new BufferedReader(sourceFileWriter);
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
