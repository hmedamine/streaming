package streaming;

import java.io.BufferedReader;
import java.io.FileReader;

public class DataReader {
	private String source;
	  
	  public DataReader(String source) {
	    this.source = source;
	  }


	  private void read() { 
	    try {
	      String line ;
	      BufferedReader file = new BufferedReader(new FileReader(source));
	      
	      while ((line = file.readLine()) != null) {
	          System.out.println(line);
	      }

	      file.close();
	    } catch (Exception e) {
	      e.printStackTrace();
	    }     
	  }    
	  
	  public static void main(String args[]) {
		  DataReader reader=new DataReader("D:/projectnes/workspace2/streaming/src/streaming/source.txt");
		  reader.read();
	  }
}
