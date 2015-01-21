

import java.io.IOException;

public interface ReadIo {
	public void openFile() throws IOException;
	public void read();
	public int calculateTotal() throws IOException;
	public void closeFile();
}
