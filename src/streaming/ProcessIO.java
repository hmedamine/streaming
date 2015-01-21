package streaming;

public class ProcessIO {
	private WriteIO writer;
	private ReadIo reader;
	
	

	public ProcessIO(WriteIO writer, ReadIo reader) {
		this.writer = writer;
		this.reader = reader;
	}

	public void processData(){
		
		
		writer.openFile();
		writer.write();
		writer.closeFile();
		
		
		reader.openFile();
		reader.read();
		reader.closeFile();
	}
	
}
