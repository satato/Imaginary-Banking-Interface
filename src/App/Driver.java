package App;

import java.util.ArrayList;
import java.util.Date;
import GUI.*;

public class Driver {

	String[] securityQuestionsOptions = { "In what city were you born?", 
			"What is your mother's maiden name?", "What is the name of your first school?", 
			"What was the make of your first car?", "What was the name of your favorite teacher?",
			"What was the name of your first pet?", "What is your favorite sports team?", 
			"What is your favorite movie?", "Where were you married?",
			"What high school did you attend?", "What is your favorite food?"};
	
	public static ArrayList<Customer> customers = new ArrayList<Customer>();
	public static ArrayList<String> usernames = new ArrayList<String>();
	public static DisplayUnit display;

	public static void main(String[] args) {
		display = new LoginWindow();
		//display = new RegistrationWindow();
	}

	/**
	 * Registers a new customer within the system
	 * @param data
	 * @param DOB
	 * @param securityResponses
	 */
	//STILL NEEDS RESPONSE VALIDATION
	public static void registerCustomer(String[] data, Date DOB, char[] pass, String[][] securityResponses) {
		int age = 0;
		usernames.add(data[2]);
		customers.add(new Customer(data[0], data[1], age, DOB, pass, securityResponses));
	}
	
	/**
	 * verifies a given password for the respective customer/accountholder
	 * @param username
	 * @param password
	 * @return
	 */
	//STILL NEEDS TO PROCEED WITH LOGIN AFTER SUCCESSFUL VERIFICATION, ERROR OTHERWISE
	public static boolean login(String username, char[] password) {
		/*VALIDATES LOGIN
		if (!usernames.contains(username)) {
			return false;
		}
		else {
			int index = usernames.indexOf(username);
			display = new AccountingWindow();
			return customers.get(index).validateLogin(password);
		}*/
		
		//TEMPORARY FOR TESTING ONLY, DOES NOT VALIDATE LOGIN
		display = new AccountingWindow();
		return true;
	}
	
}
