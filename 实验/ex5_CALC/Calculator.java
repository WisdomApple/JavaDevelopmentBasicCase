package ex5_CALC;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("Calculator");
		setLocation(200, 200);
		setSize(250, 300);
		MyPanel panel = new MyPanel();
		add(panel);
	}
}

class MyPanel extends JPanel {
	private JButton display;
	private JPanel panel;
	private double result;
	private String lastCommand;
	private boolean start;
	
	public MyPanel() {
		setLayout(new BorderLayout());
		result = 0;
		lastCommand = "=";
		display = new JButton("0");
		display.setEnabled(false);
		add(display, BorderLayout.NORTH);
		ActionListener insert = new InsertAction();
		ActionListener command = new CommandAction();
		panel = new JPanel();
		panel.setLayout(new GridLayout(4, 4));
		addButton("7", insert);
		addButton("8", insert);
		addButton("9", insert);
		addButton("/", command);
		addButton("4", insert);
		addButton("5", insert);
		addButton("6", insert);
		addButton("*", insert);
		addButton("1", insert);
		addButton("2", insert);
		addButton("3", insert);
		addButton("-", command);
		addButton("0", insert);
		addButton(".", insert);
		addButton("=", command);
		addButton("+", command);
		add(panel, BorderLayout.CENTER);
	}
	
	private void addButton(String lable, ActionListener listener) {
		JButton button = new JButton(lable);
		button.addActionListener(listener);
		panel.add(button);
	}
	
	private class InsertAction implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			String input = event.getActionCommand();
			
			if (start) {
				display.setText("");
				start = false;
			}
			
			display.setText(display.getText() + input);
		}
	}
	
	private class CommandAction implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			String command = event.getActionCommand();
			if (start) {
				
				if (command.equals("-")) {
					display.setText(command);
					start = false;
				}
				else
					lastCommand = command;
			}
			else {
				calculate(Double.parseDouble(display.getText()));
				lastCommand = command;
				start = true;
			}
		}
	}
	
	public void calculate (double x) {
		if (lastCommand.equals("+"))
			result += x;
		else if (lastCommand.equals("-"))
			result -= x;
		else if (lastCommand.equals("*"))
			result *= x;
		else if (lastCommand.equals("/"))
			result /= x;
		else if (lastCommand.equals("="))
			result = x;
		display.setText("" + result);
	}
}

public class Calculator {
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
