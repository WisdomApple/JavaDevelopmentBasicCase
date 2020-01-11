package unit10网络编程;
import java.net.*;

public class Example10_2_3_2 {
	public static void main(String[] args) throws Exception {
		byte [] buf = new byte [1024];
		DatagramSocket ds = new DatagramSocket(8954);
		DatagramPacket dp = new DatagramPacket(buf, 1024);
		
		System.out.println("等待数据接收...");
		ds.receive(dp);
		
		String str = new String(dp.getData(), 0, dp.getLength()) +
					"fom" + dp.getAddress().getHostAddress() +
					": " + dp.getPort();
		
		System.out.println("str");
		ds.close();
	}
}