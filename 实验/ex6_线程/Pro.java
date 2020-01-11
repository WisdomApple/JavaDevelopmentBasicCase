package ex6_线程;
import java.awt.*;
import java.text.*;
import java.util.*;
import javax.swing.*;

public class Pro extends JFrame implements Runnable {
	JPanel jp = null;
	JLabel lb = null;
		
	Date date = new Date();
	String myString;
	
	public void run() {
		while (true) {
			try {
				SimpleDateFormat mydate = new SimpleDateFormat("yyyy - MM - dd   HH: mm : ss");
				lb.setText(mydate.format(Calendar.getInstance().getTime()));
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public Pro() {
		myString = DateFormat.getDateInstance().format(date);
		
		lb = new JLabel(myString);
		JPanel jp = new JPanel();
		jp.add(lb);
		
		this.add(jp);
		this.setTitle("线程对象");
		this.setSize(200, 100);
		this.setLocation(500, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
	}
	
	public static void main(String[] args) {
		Pro p = new Pro();
		Thread t = new Thread(p);
		t.start();
	}
}
