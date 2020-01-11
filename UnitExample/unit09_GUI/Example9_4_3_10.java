package unit09_GUI;
import java.awt.*;
public class Example9_4_3_10 {

	public static void main(String[] args) {
		Frame f = new Frame("GridLayout");
		f.setLayout(new GridLayout(3, 3));
		f.setSize(300, 300);
		f.setLocation(400, 300);
		
		for (int i = 1; i < 10; i++) {
			Button btn = new Button("btn" + i);
			f.add(btn);
		}
		
		f.setVisible(true);
	}

}