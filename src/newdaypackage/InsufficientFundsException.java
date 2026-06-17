package newdaypackage;
/**
 * Custom exception class to indicate insufficient funds in a bank account.
 */
public class InsufficientFundsException extends Exception {
/**
 * The message associated with the exception.
 */
    private String message;
/**
 * Constructor to initialize the InsufficientFundsException with a message.
 * @param errorMessage
 */
    public InsufficientFundsException(final String errorMessage) {
        this.message = errorMessage;
    }
/**
 * Returns the message associated with the exception.
 * @return the exception message
 */
    public String getMessage() {
        return message;
    }

}
