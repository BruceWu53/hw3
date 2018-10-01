
public class BankAccount implements Comparable<BankAccount> {

	String balance;
	String name;
	public BankAccount() {};
	public BankAccount(String balance, String name) {
		this.balance = balance;
		this.name = name;
	}
	public int compareTo(BankAccount bankAccount) {
		
		return this.balance.compareTo(bankAccount.balance);
	}

}
