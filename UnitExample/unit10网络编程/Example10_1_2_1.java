package unit10������;
import java.net.InetAddress;

public class Example10_1_2_1 {
	public static void main(String[] args) throws Exception{
		InetAddress localAddress = InetAddress.getLocalHost();
		InetAddress remoteAddress = InetAddress.getByName("ww.itcast.cn");
		
		System.out.println("   ���� ��IP��ַ��" + localAddress.getHostAddress());
		System.out.println("itcate��IP��ַ��" + remoteAddress.getHostAddress());
		System.out.println("3���Ƿ�ɴ" + remoteAddress.isReachable(3000));
		System.out.println("itcast����������" + remoteAddress.getHostName());
	}
}