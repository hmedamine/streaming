package streaming;

public class MainApplication {
	public static void main(String args[]) {
		String source="D:/projectnes/workspace2/streaming/src/streaming/source.txt";
		String destination="D:/projectnes/workspace2/streaming/src/streaming/destination.txt";
		WriteIO writer=new FileDataWriter(destination);
		ReadIo reader=new FileDataReader(source);
		ProcessIO prossessor=new ProcessIO(writer,reader);
		prossessor.processData();
	}
}
