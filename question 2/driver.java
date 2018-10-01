import java.util.*;

public class driver {
	public static void main(String [] args) {
		List<BankAccount> accounts = new ArrayList<>();
		accounts.add(new BankAccount("1500", "Jane"));
		accounts.add(new BankAccount("1000", "Bob"));
		accounts.add(new BankAccount("2800", "Joe"));
		accounts.add(new BankAccount("4100", "Sally"));
		accounts.add(new BankAccount("4800", "Mike"));
		Collections.sort(accounts);
		System.out.println("Banks Accounts sorted by increasing balance.");
		for(BankAccount b : accounts) {
			System.out.println(b.name + ": $" + b.balance);
			
		}
	}
}
