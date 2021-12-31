package GUI;

import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import App.Driver;
import App.Utilities;

public class RegistrationWindow extends DisplayUnit {

	private JPanel mainPanel = new JPanel();
	private String[] data = {"John", "Doe", "username"};
	//private LocalDate DOB = LocalDate.of(1903, 01, 02);
	private Date DOB = new Date(03, 00, 02);
	char[] password;
	String[][] questionResponses = new String[3][2];
	
	public RegistrationWindow() {
		//develops general frame/interface to start with
		JFrame frame = new JFrame("Imaginary Banking Interface - Registration");
		frame.setSize(600,600);
		mainPanel.setLayout(new GridBagLayout());
		GridBagConstraints c = Utilities.defaultConstraints();
		
		//adds in labels
		JPanel labelsPanel = new JPanel();
		labelsPanel.setLayout(new GridBagLayout());
		GridBagConstraints d = Utilities.defaultConstraints();
		mainPanel.add(labelsPanel, c); c.gridy += 5;
		
		labelsPanel.add(new JLabel("First Name:"), d); d.gridy += 5;
		labelsPanel.add(new JLabel("Last Name:"), d); d.gridy += 5;
		labelsPanel.add(new JLabel("Date of Birth (MM/DD/YYYY):"), d); d.gridy += 5;
		labelsPanel.add(new JLabel("Username:"), d); d.gridy += 5;
		labelsPanel.add(new JLabel("Password:"), d); d.gridy -= 20; d.gridx += 5;
		
		//creates fields + dob spinner
		JTextField fnField = new JTextField(data[0]);
		JTextField lnField = new JTextField(data[1]);
		//dob spinner:
		SpinnerDateModel dobModel = new SpinnerDateModel(new Date(), DOB, new Date(), Calendar.DAY_OF_MONTH);
		JSpinner dobSpinner = new JSpinner(dobModel);
		JComponent editor = new JSpinner.DateEditor(dobSpinner, "MM/dd/yyyy");
		dobSpinner.setEditor(editor);
		
		//username & password fields
		JTextField userField = new JTextField(data[2]);
		JPasswordField passField = new JPasswordField();
		
		//adds in fields + dob spinner
		labelsPanel.add(fnField, d); d.gridy += 5;
		labelsPanel.add(lnField, d); d.gridy += 5;
		labelsPanel.add(dobSpinner, d); d.gridy += 5;
		labelsPanel.add(userField, d); d.gridy += 5;
		labelsPanel.add(passField, d);
		
		//creates and adds in the security questions panel + contents
		JPanel questionsPanel = new JPanel();
		mainPanel.add(new JLabel("Security Questions:"), c); c.gridy += 5;
		mainPanel.add(questionsPanel, c); c.gridy += 5;
		questionsPanel.setLayout(new GridBagLayout());
		GridBagConstraints q = Utilities.defaultConstraints();
		
		//security questions
		//NEED TO ADD BOTH QUESTIONS AND RESPONSES
		
		
		//adds in cancel & register buttons
		JPanel buttonsPanel = new JPanel();
		mainPanel.add(buttonsPanel, c);
		JButton cancelBtn = new JButton("Cancel");
		JButton registerBtn = new JButton("Register");
		
		//defines behavior for when cancel button is pressed
		cancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose(); //simply closes the current window entirely
			}
		});
		
		//defines behavior for when register button is pressed
		registerBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//checks all the fields for valid responses
			// !! STILL NEEDS TO CHECK VALIDITY !!
				
				//if valid, submits data to register the customer
				Driver.registerCustomer(data, DOB, password, questionResponses);
				//otherwise alerts the registrant of an error
			// !! STILL NEEDS TO DO THIS !!
			}
		});
		
		buttonsPanel.add(registerBtn);
		buttonsPanel.add(cancelBtn);
		
		//sets frame visible, etc.
		frame.add(mainPanel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
