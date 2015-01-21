package streaming;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class DataWriter {
	private String destinationFile;

	public DataWriter(String destination) {
		this.destinationFile = destination;
	}

	private void write() {
		try {
			BufferedWriter file = new BufferedWriter(new FileWriter(
					destinationFile));
			file.write("data insertion");
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		DataWriter writer = new DataWriter(
				"D:/projectnes/workspace2/streaming/src/streaming/source.txt");
		writer.write();
	}
}
