package unit10������.otherClass;
import java.io.*;
import java.net.*;

import java.net.ServerSocket;

public class TCPServer_10_3_3 {
	private static final int PORT = 7788;
	public void listen() throws Exception {
		ServerSocket serverSocket = new ServerSocket(PORT);
		Socket client = serverSocket.accept();
		OutputStream os = client.getOutputStream();
		System.out.println("��ʼ�Ϳͻ��˽�������");
		os.write(("��ӭ��").getBytes());
		Thread.sleep(5000);
		System.out.println("������ͻ��˽�������");
		os.close();
		client.close();
	}
}
