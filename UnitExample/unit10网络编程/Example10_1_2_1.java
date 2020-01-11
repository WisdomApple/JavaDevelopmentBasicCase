package unit10网络编程;
import java.net.InetAddress;

public class Example10_1_2_1 {
	public static void main(String[] args) throws Exception{
		InetAddress localAddress = InetAddress.getLocalHost();
		InetAddress remoteAddress = InetAddress.getByName("ww.itcast.cn");
		
		System.out.println("   本机 的IP地址：" + localAddress.getHostAddress());
		System.out.println("itcate的IP地址：" + remoteAddress.getHostAddress());
		System.out.println("3秒是否可达：" + remoteAddress.isReachable(3000));
		System.out.println("itcast的主机名：" + remoteAddress.getHostName());
	}
}