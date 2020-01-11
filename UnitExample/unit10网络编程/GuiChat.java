package unit10ÍøÂç±à³Ì;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class GuiChat extends JFrame {
	public static void main(String[] args) {
		 new GuiChat();
	}
	
	public GuiChat() {
		setUpUI();
		initSocket();
		setListener();
	}
	
	private static final int  DEFAULT_PORT = 8899;
	private JLabel stateLB;
	private JTextArea centerTextArea;
	private JPanel southPanel;
	private JTextArea inputTextArea;
	private JPanel bottomPanel;
	private JTextField ipTextField;
	private JTextField remotePortTF;
	private JButton sendBT;
	private JButton clearBT;
	private DatagramSocket datagramSocket;

	public void setUpUI() {
		setTitle("GUI Windows");
		setSize(400, 200);
		setResizable(false);
		setLocationRelativeTo(null);
		
		stateLB = new JLabel("The listening is not currently started.");
		stateLB.setHorizontalAlignment(JLabel.RIGHT);
		
		centerTextArea = new JTextArea();
		centerTextArea.setEditable(false);
		centerTextArea.setBackground(new Color(211, 211, 211));
		
		southPanel = new JPanel(new BorderLayout());
		inputTextArea = new JTextArea(5, 20);
		bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));
		ipTextField = new JTextField("127.0.0.1", 8);
		remotePortTF = new JTextField(String.valueOf(DEFAULT_PORT), 3);
		sendBT = new JButton("Send");
		clearBT = new JButton("ClS");
		
		bottomPanel.add(ipTextField);
		bottomPanel.add(remotePortTF);
		bottomPanel.add(sendBT);
		bottomPanel.add(clearBT);
		
		southPanel.add(new JScrollPane(inputTextArea), BorderLayout.CENTER);
		southPanel.add(bottomPanel, BorderLayout.SOUTH);
		
		add(stateLB, BorderLayout.NORTH);
		add(new JScrollPane(centerTextArea), BorderLayout.CENTER);
		add(southPanel, BorderLayout.SOUTH);
		setVisible(true);
	}
	
	private void setListener() {
		sendBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final String ipAddress = ipTextField.getText();
				final String remotePort = remotePortTF.getText();
				
				if (ipAddress == null || ipAddress.trim().equals("") ||
						remotePort == null || remotePort.trim().equals("")) {
					JOptionPane.showMessageDialog(GuiChat.this, "Please enter the IP address and port number.");
					return;
				}
				if (datagramSocket == null || datagramSocket.isClosed()) {
					JOptionPane.showMessageDialog(GuiChat.this, "Listening to the failure.");
					return;
				}
				
				String sendContent = inputTextArea.getText();
				byte [] buf = sendContent.getBytes();
				try {
					centerTextArea.append("I say to " + ipAddress + remotePort + ": \n"  + inputTextArea.getText() + "\n\n");
					centerTextArea.setCaretPosition(centerTextArea.getText().length());
					
					datagramSocket.send(new DatagramPacket(buf, buf.length, 
							InetAddress.getByName(ipAddress), Integer.parseInt(remotePort)));
				} catch(IOException e1) {
					JOptionPane.showMessageDialog(GuiChat.this, "An error occurred and the transmission was unsuccessful");
					e1.printStackTrace();
				}
			}
		});
		clearBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				centerTextArea.setText("");
			}
		});
	}
	
	private void initSocket() {
		int port = DEFAULT_PORT;
		while (true) {
			try {
				if (datagramSocket != null && !datagramSocket.isClosed())
					datagramSocket.close();
				try {
					port = Integer.parseInt(JOptionPane.showInputDialog(this, "Please enter the port number.", "port number: ", JOptionPane.QUESTION_MESSAGE));
					if (port < 1 || port > 65535)
						throw new RuntimeException("Port number out of range.");
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "The port number you entered is incorrect. Please enter a number between 1 and 65535");
					continue;
				}
				
				datagramSocket = new DatagramSocket(port);
				startLlisten();
				stateLB.setText("You are listening on port: " + port);
				break;
			} catch (SocketException e) {
				JOptionPane.showMessageDialog(this, "The port is nearly occupied. Please reset the port");
				stateLB.setText("The listening is not currently started.");
			}
		}
	}
	
	private void startLlisten() {
		new Thread() {
			private DatagramPacket p;
			public void run() {
				byte [] buf = new byte[1024];
				
				p = new DatagramPacket(buf, buf.length);
				while (!datagramSocket.isClosed()) {
					try {
						datagramSocket.receive(p);
						
						centerTextArea.append(p.getAddress().getHostAddress() + "says to me: " + ((InetSocketAddress)p.getSocketAddress()).getPort() + "\n\n");
						centerTextArea.setCaretPosition(centerTextArea.getText().length());
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}.start();
	}
	
}