package GUI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.*;

import App.Driver;
import App.Utilities;

public class LoginWindow extends DisplayUnit {

	private JPanel mainPanel = new JPanel();
	private String user = "username";
	private char[] pass;
	
	public LoginWindow() {
		//develops general frame/interface to start with
		JFrame frame = new JFrame("Imaginary Banking Interface - Login");
		frame.setSize(600,600);
		mainPanel.setLayout(new GridBagLayout());
		GridBagConstraints c = Utilities.defaultConstraints();
		GridBagConstraints d = Utilities.defaultConstraints();
		GridBagConstraints e = Utilities.defaultConstraints();
		
		mainPanel.add(new JLabel("Login")); c.gridy += 5;
		JPanel loginInfoPanel = new JPanel();
		loginInfoPanel.setLayout(new GridBagLayout());
		//USERNAME AND PASSWORD TEXT FIELDS
		JTextField usernameField = new JTextField("username");
		JPasswordField passwordField = new JPasswordField();
		
		//defines behavior for updates to the username field
		usernameField.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent arg0) {
				//do nothing
			}

			public void insertUpdate(DocumentEvent arg0) {
				user = usernameField.getText();
			}

			public void removeUpdate(DocumentEvent arg0) {
				user = usernameField.getText();
			}
		});
		
		//defines behavior for updates to the password field
		passwordField.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent arg0) {
				//do nothing
			}

			public void insertUpdate(DocumentEvent arg0) {
				pass = passwordField.getPassword();
			}

			public void removeUpdate(DocumentEvent arg0) {
				pass = passwordField.getPassword();
			}
		});
		
		loginInfoPanel.add(usernameField, d); d.gridy += 5;
		loginInfoPanel.add(passwordField, d);
		mainPanel.add(loginInfoPanel, c); c.gridy += 5;
		
		JPanel loginButtonsPanel = new JPanel();
		mainPanel.add(loginButtonsPanel, c);
		//LOGIN, REGISTER, AND FORGOT PASSWORD BUTTONS
		JButton loginBtn = new JButton("Login");
		JButton registerBtn = new JButton("Register");
		JButton forgotPassBtn = new JButton("Forgot Password");
		
		//defines behavior for when the 'Login' button is clicked
		loginBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				//validates login info
				if (Driver.login(user, pass))
					frame.dispose(); //if successful, this window disposes
				else { //otherwise lets the user know their login info was invalid
					JOptionPane.showMessageDialog(frame,
						    "Your username or password is incorrect",
						    "Invalid Login",
						    JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		
		//defines behavior for when the 'Register' button is clicked
		registerBtn.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				//creates the registration window in addition to the current window
	            RegistrationWindow register = new RegistrationWindow();
	        }  
	    });
		
		//defines behavior for when the 'Forgot Password' button is clicked
		forgotPassBtn.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
	            //creates the forgot password window in addition to the current window
				ForgotPasswordWindow passwordReset = new ForgotPasswordWindow();
	        }  
	    });
		
		//adds the appropriate buttons to the login buttons panel for organization
		loginButtonsPanel.add(loginBtn, e); e.gridx += 5;
		loginButtonsPanel.add(registerBtn, e); e.gridx += 5;
		loginButtonsPanel.add(forgotPassBtn, e);
		
		//sets frame visible, adds content, etc.
		frame.add(mainPanel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
}
