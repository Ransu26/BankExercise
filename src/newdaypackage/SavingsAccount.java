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
}
