package App;

import java.util.Comparator;

public class Sortbyaccounttype implements Comparator<Account>{

	/**
	 * compares two Account objects by account type and lexicographically by the account name
	 */
	@Override
	public int compare(Account a, Account b) {
		if (a.getType() == b.getType()) {
			return a.view()[0].compareTo(b.view()[0]);
		}
		else {
			return a.getType().compareTo(b.getType());
		}
	}

}
