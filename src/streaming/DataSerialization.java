package streaming;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataSerialization implements ReadIo {
	private String source;
	private BufferedReader file;

	public DataSerialization(String source) {
		this.source = source;
	}

	public void read() {
		try {
			String line;
			while ((line = file.readLine()) != null) {
				String[] split = line.split(",");
				Person person = new Person();
				String firstName = split[0];
				String lastName = split[1];
				String date = split[2];
				person.setFirstName(firstName);
				person.setLastName(lastName);
				person.setDate(date);
				System.out.println(person.toString());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void openFile() {
		try {
			FileReader sourceFileReader = new FileReader(source);
			file = new BufferedReader(sourceFileReader);
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

	@Override
	public int calculateTotal() throws IOException {
		return 0;
	}

}
