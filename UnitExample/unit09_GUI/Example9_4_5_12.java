package unit09_GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example9_4_5_12 {
	public static void main(String[] args) {
		Cardlayout cardlayout = new Cardlayout();
	}
}

class Cardlayout extends Frame implements ActionListener {
	Panel cardPanel = new Panel();
	Panel contropaPanel= new Panel();
	Button nextbutton, preButton;
	CardLayout cardLayout = new CardLayout();
	
	public Cardlayout () {
		setSize (300, 200);
		setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				Cardlayout.this.dispose();
			}
		});
		
		cardPanel.setLayout(cardLayout);
		cardPanel.add(new Label("1st Interface"), Label.CENTER);
		cardPanel.add(new Label("2nd Interface"), Label.CENTER);
		cardPanel.add(new Label("3rd Interface"), Label.CENTER);
		
		nextbutton = new Button("Next Card");
		preButton = new Button("Previous Card");
		
		nextbutton.addActionListener(this);
		preButton.addActionListener(this);
		
		this.add(cardPanel, BorderLayout.CENTER);
		this.add(contropaPanel, BorderLayout.SOUTH);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == nextbutton) {
			cardLayout.next(cardPanel);
		}
		if (e.getSource() == preButton) {
			cardLayout.previous(cardPanel);
		}
	}
}