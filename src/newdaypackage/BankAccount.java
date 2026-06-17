package newdaypackage;

import java.util.ArrayList;
import java.util.List;

/**
 * BankAccount class represents a bank account with functionalities to deposit,
 * withdraw, getTransaction, getBalance, freeze and un-freeze the account.
 */
public class BankAccount {
    /**
     * The balance of the bank account.
     */
    private double balance;
    /**
     * A boolean variable to indicate whether the account is frozen or not.
     */
    private boolean isFrozen;
    /**
     * A list to store the transaction history of the bank account.
     */
    private List<Transaction> transactionHistory;

    /**
     * Constructor to initialize the BankAccount with a balance and frozen
     * status.
     * @param accountBalance
     * @param isAccountFrozen
     */
    public BankAccount(final double accountBalance,
            final boolean isAccountFrozen) {
        this.transactionHistory = new ArrayList<>();
    }
    /**
     * Deposits a specified amount into the bank account
     * if the account is not frozen and the amount is valid.
     * @param amount
     */
    public void deposit(final double amount) {
        try {
            if (!isFrozen) {
                System.out.printf("Amount Deposited: %.2f%n", amount);
                if (amount <= 0) {
                    throw new InvalidAmountException(
                            "Amount is not valid. Must be greater than 0.");
                }
                balance = balance + amount;
                transactionHistory.add(new Transaction("Desposit", amount));
                System.out.printf("Current Balance: %.2f%n", balance);
                return;
            }
            throw new AccountFrozenException(
                    "Account is Frozen. Unable to Transact.");
        } catch (AccountFrozenException e) {
            System.out.println(e.getMessage());
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }

    }
/**
 * Withdraws a specified amount from the bank account.
 * @param amount
 */
    public void withdraw(final double amount) {
        try {
            if (!isFrozen) {
                System.out.printf("Amount Withdrawn: %.2f%n", amount);

                if (amount > balance) {
                    String accountBalance = String.format("%.2f", this.balance);
                    throw new InsufficientFundsException(
                            "Insuficient funds.\nCurrent Balance: "
                    + accountBalance);
                }
                if (amount <= 0) {
                    throw new InvalidAmountException(
                            "Amount is not valid. Must be greater than 0.");
                }
                balance = balance - amount;
                transactionHistory.add(new Transaction("Withdraw", amount));
                System.out.printf("Current Balance: %.2f%n", balance);
                return;
            }
            throw new AccountFrozenException(
                    "Account is Frozen. Unable to Transact.");
        } catch (AccountFrozenException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }

    }
/**
 * Returns a list of transactions that have been made on the bank account.
 * @return List of transactions in the transaction history.
 */
    public List<Transaction> getTransactionHistory() {
        List<Transaction> txHistory = new ArrayList<>();
        for (Transaction log : transactionHistory) {
            txHistory.add(log);
        }
        return txHistory;
    }
/**
 * Returns the current balance of the bank account.
 * @return The current balance of the bank account.
 */
    public double getBalance() {
        return balance;
    }
/**
 * Freezes the bank account, preventing any
 * further transactions from being made.
 */
    public void freezeAccount() {
        this.isFrozen = true;
    }
/**
 *  Un-freezes the bank account, allowing transactions to be made again.
 */
    public void unfreezeAccount() {
        this.isFrozen = false;
    }
/**
 * Checks if the bank account is currently frozen.
 * @return true if the account is frozen, false otherwise.
 */
    public boolean isFrozen() {
        return isFrozen;
    }

}
