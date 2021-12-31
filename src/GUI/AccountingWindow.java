package GUI;

import javax.swing.*;

public class AccountingWindow extends DisplayUnit {

	private JPanel mainPanel = new JPanel();
	
	public AccountingWindow() {
		//develops general frame/interface to start with
		JFrame frame = new JFrame("Imaginary Banking Interface");
		frame.setSize(600,600);
		
		//sets frame visible, etc.
		frame.add(mainPanel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
