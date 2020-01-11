package unit09_GUI;
import java.awt.*;
import java.awt.event.*;

public class Example9_4_1_8 {
	public static void main(String[] args) {
		final Frame f = new Frame("FlowLayout");
		f.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 30));
		f.setSize(200, 300);
		f.setLocation(300, 200);
		Button but1 = new Button("No.1 button");
		f.add(but1);
		
		but1.addActionListener(new ActionListener() {
			private int num = 1;
			
			public void actionPerformed(ActionEvent e) {
				f.add(new Button("No."+ ++num + " button"));
				f.setVisible(true);
			}
		});
		
		f.setVisible(true);
	}
}
