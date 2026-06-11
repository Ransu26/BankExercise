package newdaypackage;

public class SavingsAccount extends BankAccount{
	private String ownerName;
	
	public SavingsAccount(double balance, boolean isFrozen) {
		super(balance, isFrozen);
	}
	
	public SavingsAccount(String ownerName) {
		super(0.0, false);
		this.ownerName = ownerName;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
//	public static void main(String[] args) {
//		BankAccount acc1 = new SavingsAccount("Test0");
//		acc1.deposit(1000.125);
//		acc1.freezeAccount();
//		acc1.withdraw(500);
//		acc1.unfreezeAccount();
//		acc1.withdraw(100);
//		acc1.getTransactionHistory();
//
//	}
}
