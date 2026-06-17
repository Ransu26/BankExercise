package newdaypackage;

/**
 * SavingsAccount class extends BankAccount and represents a savings account
 * with an owner name.
 */
public class SavingsAccount extends BankAccount {
    /**
     * The name of the owner of the savings account.
     */
    private String ownerName;
/**
 * Constructor to initialize the SavingsAccount with a balance and frozen.
 * @param balance
 * @param isFrozen
 */
    public SavingsAccount(final double balance, final boolean isFrozen) {
        super(balance, isFrozen);
    }
/**
 * Constructor to initialize the SavingsAccount
 * with an owner name, a balance of 0.0, and not frozen.
 * @param accountOwnerName
 */
    public SavingsAccount(final String accountOwnerName) {
        super(0.0, false);
    }
/**
 * Returns the name of the owner of the savings account.
 * @return the owner name
 */
    public String getOwnerName() {
        return ownerName;
    }
}
