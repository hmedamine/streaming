package streaming;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileDataReader implements ReadIo {
	private String source;
	  
	  public FileDataReader(String source) {
	    this.source = source;
	  }


	  public void read() { 
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
	  
	  
}
