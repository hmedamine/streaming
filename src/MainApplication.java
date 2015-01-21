

import java.io.IOException;

public class MainApplication {
	public static void main(String args[]) throws IOException {
		String source="D:/projectnes/workspace2/streaming/src/serialize.txt";
		String destination="D:/projectnes/workspace2/streaming/src/streaming/source.txt";
		WriteIO writer=new FileDataWriter(destination);
//		ReadIo reader=new FileDataReader(source);
		ReadIo reader=new DataSerialization(source);
		ProcessIO prossessor=new ProcessIO(writer,reader);
		prossessor.processData();
	}
}
