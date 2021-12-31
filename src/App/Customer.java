package App;

import java.util.ArrayList;
import java.util.Date;

public class Customer {
	private String firstName, lastName;
	private int age;
	private Date DOB;
	private char[] password;
	private String[][] securityQuestions = new String[3][2];
	private ArrayList<Account> accounts = new ArrayList<Account>();
	
	/**
	 * Constructor
	 */
	public Customer(String first, String last, int age, Date dob, char[] pass, String[][] secQuestions) {
		firstName = first;
		lastName = last;
		this.age = age;
		DOB = dob;
		password = pass;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 2; j++) {
				securityQuestions[i][j] = secQuestions[i][j];
			}
		}
	}
	
	public boolean validateLogin(char[] password) {
		if (this.password == password) {
			return true;
		}
		else {
			return false;
		}
	}
}
