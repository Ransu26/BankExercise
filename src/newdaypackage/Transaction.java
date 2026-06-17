package newdaypackage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 * Transaction class represents a
 * transaction with a type, amount, and time-stamp.
 */
public class Transaction {
    /**
     * The type of the transaction (e.g., deposit, withdrawal).
     */
    private String transactionType;
    /**
     * The amount involved in the transaction.
     */
    private double bankTransactionAmount;
    /**
     * The time-stamp of when the transaction occurred.
     */
    private LocalDateTime timeStamp;
/**
 * Constructor to initialize the Transaction with a type and amount.
 * @param transactionType
 * @param bankTransactionAmount
 */
    public Transaction(final String transactionType,
            final double bankTransactionAmount) {
        this.transactionType = transactionType;
        this.bankTransactionAmount = bankTransactionAmount;

        this.timeStamp = LocalDateTime.now();
    }
/**
 * Returns a string representation of the
 * transaction, including its type, time-stamp, and amount.
 * @return a string representation of the transaction.
 */
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter
                .ofPattern("yyyy-MM-dd HH:mm");
        String transaction = "Type=" + transactionType + ", amount="
                + String.format("%.2f", bankTransactionAmount) + ", time_stamp="
                + timeStamp.format(formatter);
        return transaction;
    }
    /**
     * Returns the type of the transaction.
     * @return the transaction type
     */
    public double getTransactionAmount() {
        return bankTransactionAmount;
    }

}
