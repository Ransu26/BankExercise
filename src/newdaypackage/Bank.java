package newdaypackage;
/**
 * Bank interface defines the contract for a bank that can manage bank accounts.
 */
public interface Bank {
    /**
     * Adds a bank account to the bank.
     * @param account
     */
    void addAccount(BankAccount account);
/**
 * Retrieves a bank account by its ID.
 * @param id
 */
    void getAccount(int id);

}
