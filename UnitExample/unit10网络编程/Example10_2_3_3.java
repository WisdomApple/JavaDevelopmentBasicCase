package unit10������;

import java.net.*;

public class Example10_2_3_3 {
	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(3000);
		String str = "Hello";
		
		DatagramPacket dp = new DatagramPacket
							(str.getBytes(), str.length(),
							InetAddress.getByName("localhost"), 8954);
		
		System.out.println("������Ϣ...");
		ds.send(dp);
		ds.close();
	}
}
