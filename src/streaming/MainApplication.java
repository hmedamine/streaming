package streaming;

public class MainApplication {
	public static void main(String args[]) {
		ProcessIO prossessor=new ProcessIO();
		String source="D:/projectnes/workspace2/streaming/src/streaming/source.txt";
		String destination="D:/projectnes/workspace2/streaming/src/streaming/source.txt";
		prossessor.processData(source, destination);
	}
}
