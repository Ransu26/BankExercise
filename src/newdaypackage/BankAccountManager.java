package newdaypackage;

import java.util.HashMap;
import java.util.Map;

public class BankAccountManager implements Bank{
	
	private Map<Integer, BankAccount> accounts;
	private int id;
	
	public static void main(String[] args) {
		BankAccount acc1 = new SavingsAccount("Test0");
		acc1.deposit(1000.125);
		BankAccountManager accM1 = new BankAccountManager();
		accM1.addAccount(acc1);
		accM1.addAccount(new SavingsAccount("Test1"));
		accM1.listAccounts();
		
	}
	
	public BankAccountManager() {
		accounts = new HashMap<>();
		id = 0;
	}

	@Override
	public void addAccount(BankAccount account) {
		if(id==100) {
			System.out.println("Account pool is already full.");
			return;
		}
		accounts.put(id, account);
		System.out.println("Account added successfully with ID:" + id);
		++id;
	}

	@Override
	public void getAccount(int id) {
		if(accounts.containsKey(id)) {
			BankAccount bankAccount = accounts.get(id);
			
			SavingsAccount owner = (SavingsAccount) bankAccount;
			
			System.out.println("Account ID:" + id + ", Account name: " + owner.getOwnerName() + ", Balance: " + bankAccount.getBalance() + 
					", isFrozen: " + bankAccount.isFrozen());
		}
		
	}
	
	public void listAccounts() {
		for(Map.Entry<Integer, BankAccount> accountEntry : accounts.entrySet()) {
			int id = accountEntry.getKey();
			BankAccount account = accountEntry.getValue();
			SavingsAccount owner = (SavingsAccount) account;
			System.out.println("Account ID:" + id + ", Account name: " + owner.getOwnerName() + ", Balance: " + account.getBalance() + 
					", isFrozen: " + account.isFrozen());
		}
	}
}
