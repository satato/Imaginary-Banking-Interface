package GUI;

import javax.swing.*;

public class ForgotPasswordWindow extends DisplayUnit {

	private JPanel mainPanel = new JPanel();
	
	public ForgotPasswordWindow() {
		//develops general frame/interface to start with
		JFrame frame = new JFrame("Imaginary Banking Interface - Password Recovery");
		frame.setSize(600,600);
		
		//sets frame visible, etc.
		frame.add(mainPanel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
