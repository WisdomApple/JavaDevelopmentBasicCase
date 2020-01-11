package unit10ÍøÂç±à³Ì.otherClass;
import java.io.*;
import java.net.*;

public class TCPClient_10_3_3 {
	private static final int PORT = 7788;
	public void connect() throws Exception {
		Socket client = new Socket(InetAddress.getLocalHost(), PORT);
		InputStream is = client.getInputStream();
		byte[] buf = new byte[1024];
		int len = is.read(buf);
		System.out.println(new String(buf, 0, len));
		client.close();
	}
}