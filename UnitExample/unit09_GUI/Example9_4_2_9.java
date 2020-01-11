package unit09_GUI;
import java.awt.*;
public class Example9_4_2_9 {

	public static void main(String[] args) {
		final Frame f = new Frame("BorderLayout");
		f.setLayout(new FlowLayout());
		f.setSize(300, 300);
		f.setLocation(300, 200);
		f.setVisible(true);
		
		Button but1 = new Button("East");
		Button but2 = new Button("West");
		Button but3 = new Button("South");
		Button but4 = new Button("North");
		Button but5 = new Button("Center");
		
		f.add(but1, BorderLayout.EAST);
		f.add(but2, BorderLayout.WEST);
		f.add(but3, BorderLayout.SOUTH);
		f.add(but4, BorderLayout.NORTH);
		f.add(but5, BorderLayout.CENTER);
	}

}