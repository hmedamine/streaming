package streaming;

public class ProcessIO {

	public void processData(String source,String destination){
		
		WriteIO writer=new FileDataWriter(destination);
		writer.write();
		
		ReadIo reader=new FileDataReader(source);
		reader.read();
		
	}
	
}
