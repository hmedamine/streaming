package streaming;

public class ProcessIO {

	public void processData(String source,String destination){
		
		WriteIO writer=new FileDataWriter(destination);
		writer.openFile();
		writer.write();
		writer.closeFile();
		
		ReadIo reader=new FileDataReader(source);
		reader.openFile();
		reader.read();
		reader.closeFile();
	}
	
}
