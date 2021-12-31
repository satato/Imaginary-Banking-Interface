package App;

public class Account {
	
	public enum accountType{CHECKING, SAVINGS};
	
	private double funds;
	private String accountName;
	private Customer accountOwner;
	private accountType type = accountType.CHECKING;
	
	/**
	 * Constructors
	 */
	//ALL STILL NEED TO CHECK FOR VALID ARGUMENTS BEFORE SETTING
	public Account(Customer owner) {
		accountOwner = owner;
		funds = 0.0;
		accountName = type.toString();
	}
	
	public Account(Customer owner, accountType type) {
		accountOwner = owner;
		this.type = type;
		funds = 0.0;
		accountName = type.toString();
	}
	
	public Account(Customer owner, double initialDeposit) {
		accountOwner = owner;
		funds = initialDeposit;
		accountName = type.toString();
	}
	
	public Account(Customer owner, accountType type, double initialDeposit) {
		accountOwner = owner;
		this.type = type;
		funds = initialDeposit;
		accountName = type.toString();
	}
	
	/**
	 * edits the customName field as the account holder sees fit
	 * @param name
	 */
	public void editName(String name) {
		//NEEDS TO CHECK FOR NEW NAME VALIDITY FIRST
		this.accountName = name;
	}
	
	/**
	 * allows one to view the current funds of this account
	 * @return
	 */
	public String[] view() {
		String[] accountView = {accountName, Double.toString(funds)};
		return accountView;
	}
	
	/**
	 * allows one to make a deposit
	 * @param deposit
	 * @return
	 */
	public boolean deposit(double deposit) {
		//NEEDS TO CHECK FOR VALID DEPOSIT AMOUNTS
		funds += deposit;
		return true;
	}
	
	/**
	 * takes a deposit as a result of funds transfer
	 * @param deposit
	 * @param otherAcc
	 * @return
	 */
	private boolean externalDeposit(double deposit, Account otherAcc) {
		//NEEDS TO CHECK FOR VALID DEPOSIT AMOUNTS
		funds += deposit;
		return true;
	}
	
	/**
	 * makes a transfer of funds from this account to some other
	 * @param otherAcc
	 * @param transferAmt
	 * @return
	 */
	public boolean transfer(Account otherAcc, double transferAmt) {
		//NEEDS TO CHECK VALIDITY OF THE OTHER ACCOUNT AND THE TRANSFER AMOUNT, ETC.
		otherAcc.externalDeposit(transferAmt, otherAcc);
		return true;
	}
	
	/**
	 * allows the accountholder to withdraw funds from this account
	 * @param amount
	 * @return
	 */
	public boolean withdraw(double amount) {
		//NEEDS TO CHECK FOR VALID ARGUMENTS AND PERMISSIONS
		funds -= amount;
		return true;
	}
	
	public String getType() {
		return this.type.toString();
	}
	
}
