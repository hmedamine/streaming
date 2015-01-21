

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Calendar;

import dto.Person;

public class DataSerialization implements ReadIo {
	private String source;
	private BufferedReader file;

	public DataSerialization(String source) {
		this.source = source;
	}

	public void read() {
		try {
			String line;
//			while ((line = file.readLine()) != null) {
//				String[] split = line.split(",");
				Person person = new Person("amine", "mohamed", Calendar.getInstance().getTime());
//				String firstName = split[0];
//				String lastName = split[1];
//				String date = split[2];
//				person.setFirstName("amine");
//				person.setLastName("mohamed");
//				person.setDate(Calendar.getInstance().getTime());
//				serializeData(person);
				deSerializeData(person);
				//System.out.println(person.toString());
//			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void deSerializeData(Person person) throws IOException, ClassNotFoundException {
		InputStream outputStream=new FileInputStream(source);
		ObjectInputStream in=new ObjectInputStream(outputStream);
		Person outPerson=(Person) in.readObject();
		System.out.println("person="+outPerson.toString());
		in.close();
	}

	private void serializeData(Person person) throws FileNotFoundException,IOException {
		OutputStream outputStream=new FileOutputStream(source);
		ObjectOutputStream out=new ObjectOutputStream(outputStream);
		out.writeObject(person);
		out.close();
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
