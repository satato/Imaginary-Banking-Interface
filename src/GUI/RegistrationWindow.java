package GUI;

import java.awt.GridBagLayout;
import java.awt.*;
import javax.swing.*;

public class RegistrationWindow extends DisplayUnit {

	private JPanel mainPanel = new JPanel();
	
	public RegistrationWindow() {
		//develops general frame/interface to start with
		JFrame frame = new JFrame("Imaginary Banking Interface - Registration");
		frame.setSize(600,600);
		
		mainPanel.setLayout(new GridBagLayout());
		
		//sets frame visible, etc.
		frame.add(mainPanel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
