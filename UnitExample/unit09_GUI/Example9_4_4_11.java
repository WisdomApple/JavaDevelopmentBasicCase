package unit09_GUI;
import java.awt.*;
public class Example9_4_4_11 {

	public static void main(String[] args) {
		new Layout("GirdBagLayout");
	}

}
	
class Layout extends Frame {
	public Layout(String title) {
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		this.setLayout(layout);
		
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 1;
		c.weighty = 2;
		this.addComponet("btn1", layout, c);
		this.addComponet("btn2", layout, c);
		this.addComponet("btn3", layout, c);
		
		c.gridwidth = GridBagConstraints.REMAINDER;
		this.addComponet("btn4", layout, c);
		
		c.weightx = 0;
		c.weighty = 0;
		addComponet("btn5", layout, c);
		
		c.gridheight = 1;
		this.addComponet("btn6", layout, c);
		
		c.gridwidth = GridBagConstraints.REMAINDER;
		this.addComponet("btn7", layout, c);
		
		c.gridheight = 2;
		c.gridwidth = 1;
		c.weightx = 2;
		c.weighty = 2;
		this.addComponet("btn8", layout, c);
		
		c.gridheight = GridBagConstraints.REMAINDER;
		c.gridwidth = 1;
		this.addComponet("btn9", layout, c);
		this.addComponet("btn10", layout, c);
		
		this.pack();
		this.setVisible(true);
	}

	private void addComponet (String name, GridBagLayout layout, GridBagConstraints c) {
		Button bt = new Button(name);
		layout.setConstraints(bt, c);
		this.add(bt);
	}
}