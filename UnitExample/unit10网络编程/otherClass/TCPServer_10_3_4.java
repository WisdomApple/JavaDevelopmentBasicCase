package unit10网络编程.otherClass;
import java.io.*;
import java.net.*;

public class TCPServer_10_3_4 {
	private static final int PORT = 7788;
	public void listen() throws Exception {
		ServerSocket serverSocket = new ServerSocket(PORT);
		while (true) {
			final Socket client = serverSocket.accept();
			new Thread() {
				public void run() {
					OutputStream os;
					try {
						os = client.getOutputStream();
						System.out.println("开始和客户端交互数据");
						os.write(("欢迎！").getBytes());
						Thread.sleep(5000);
						System.out.println("结束与客户端交互数据");
						os.close();
						client.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				};
			}.start();
		}
	}
}
