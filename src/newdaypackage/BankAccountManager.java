package newdaypackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * BankAccountManager class manages multiple bank accounts and provides
 * functionalities to filter and sort transactions.
 */

public class BankAccountManager implements Bank {
    /**
     * A map to store bank accounts with their corresponding IDs.
     */
    private Map<Integer, BankAccount> accounts;
    /**
     * A variable to keep track of the next available account ID.
     */
    private int id;

    /**
     * The main method to demonstrate the functionality of the
     * BankAccountManager.
     *
     * @param args
     */
    public static void main(final String[] args) {
        BankAccount acc1 = new SavingsAccount("Test0");
        BankAccountManager accM1 = new BankAccountManager();
        final double initialBalance = 100;
        final double secondBalance = 11500;
        final double thirdBalance = 1500;
        final double fthBalance = 200;
        final double fifthBalance = 500;
        acc1.deposit(initialBalance);
        acc1.deposit(-fifthBalance);
        acc1.freezeAccount();
        acc1.deposit(secondBalance);
        acc1.unfreezeAccount();
        acc1.deposit(secondBalance);
        acc1.withdraw(-initialBalance);
        acc1.withdraw(thirdBalance);
        acc1.freezeAccount();
        acc1.withdraw(fifthBalance);
        acc1.unfreezeAccount();
        accM1.filterTransactionsAtOrAbove(fthBalance,
                acc1.getTransactionHistory());
        accM1.sortTransactionsByAmount(acc1.getTransactionHistory());

    }
    /**
     * Filters transactions that are at or above a specified amount and prints.
     * @param amount
     * @param txList
     */
    public void filterTransactionsAtOrAbove(final double amount,
            final List<Transaction> txList) {
        List<Transaction> filteredTxList = new ArrayList<>();
        System.out.println("Transactions at or above " + amount);
        filteredTxList = txList.stream().filter(tx ->
        tx.getTransactionAmount() >= amount)
                .toList();
        filteredTxList.forEach(tx -> System.out.println(tx.toString()));
    }
    /**
     * Sorts transactions by their amount in ascending order and prints them.
     * @param txList
     */
    public void sortTransactionsByAmount(final List<Transaction> txList) {
        List<Transaction> sortedList = new ArrayList<>();
        System.out.println("Transactions sorted by amount...");
        sortedList = txList.stream()
                .sorted((tx1, tx2) ->
                Double.compare(tx1.getTransactionAmount(),
                        tx2.getTransactionAmount()))
                .toList();
        sortedList.forEach(tx -> System.out.println(tx.toString()));
    }
    /**
     * Constructor for the BankAccountManager class.
     * Initializes the accounts map and sets the initial ID to 0.
     */
    public BankAccountManager() {
        accounts = new HashMap<>();
        id = 0;
    }
    /**
     * Adds a bank account to the manager. If the account pool is full (ID
     * reaches 100), it prints a message and does not add the account.
     * @param account The bank account to be added.
     */
    @Override
    public void addAccount(final BankAccount account) {
        final int accountPool = 100;
        if (id == accountPool) {
            System.out.println("Account pool is already full.");
            return;
        }
        accounts.put(id, account);
        System.out.println("Account added successfully with ID:" + id);
        ++id;
    }
    /**
     * Retrieves and prints the details of a bank account based on its ID.
     */
    @Override
    public void getAccount(final int accountId) {
        if (accounts.containsKey(id)) {
            BankAccount bankAccount = accounts.get(id);

            SavingsAccount owner = (SavingsAccount) bankAccount;

            System.out.println("Account ID:" + id + ", Account name: "
                    + owner.getOwnerName() + ", Balance: "
                    + bankAccount.getBalance() + ", isFrozen: "
                    + bankAccount.isFrozen());
        }

    }
    /**
     * Lists all bank accounts managed by the BankAccountManager.
     */
    public void listAccounts() {
        for (Map.Entry<Integer, BankAccount> accountEntry : accounts
                .entrySet()) {
            int entryAccountId = accountEntry.getKey();
            BankAccount account = accountEntry.getValue();
            SavingsAccount owner = (SavingsAccount) account;
            System.out.println("Account ID:"
                    + entryAccountId + ", Account name: "
                    + owner.getOwnerName() + ", Balance: "
                    + account.getBalance() + ", isFrozen: "
                    + account.isFrozen());
        }
    }
}
