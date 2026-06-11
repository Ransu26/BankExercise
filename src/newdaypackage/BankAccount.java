package newdaypackage;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {

	private double balance;
	private boolean isFrozen;
	private List<Transaction> transactionHistory;
	
	public BankAccount(double balance, boolean isFrozen) {
		this.balance = balance;
		this.isFrozen = isFrozen;
		this.transactionHistory = new ArrayList<>();
	}
	
	public void deposit(double amount) {
		
		if(!isFrozen) {
			System.out.printf("Amount Deposited: %.2f%n",amount);
			if(amount <= 0) {
				System.out.println("Amount is not valid. Must be greater than 0.");
				return;
			}
			balance = balance + amount;
			transactionHistory.add(new Transaction("Desposit", amount));
			System.out.printf("Current Balance: %.2f%n", balance);
			return;
		}
		System.out.println("Account is Frozen. Unable to Transact.");

		
	}
	
	public void withdraw(double amount) {
		if(!isFrozen) {
			System.out.printf("Amount Withdrawn: %.2f%n", amount);

			if(amount > balance) {
				System.out.println("Insuficient funds.");
				System.out.printf("Current Balance: %.2f%n", balance);
				return;
			}
			if(amount <= 0) {
				System.out.println("Amount is not valid. Must be greater than 0.");
				return;
			}
			balance = balance - amount;
			transactionHistory.add(new Transaction("Withdraw", amount));
			System.out.printf("Current Balance: %.2f%n", balance);
			return;
		}
		System.out.println("Account is Frozen. Unable to Transact.");
		

	}
	
	public void getTransactionHistory() {
		System.out.println("Transaction History: ");
		for(Transaction log: transactionHistory) {
			System.out.println(log);
		}
		
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void freezeAccount() {
		this.isFrozen = true;
	}
	
	public void unfreezeAccount() {
		this.isFrozen = false;
	}
	
	public boolean isFrozen() {
		return isFrozen;
	}

}
