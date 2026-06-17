package newdaypackage;
/**
 * Custom exception class to indicate that a
 * bank account is frozen and cannot perform certain operations.
 */
public class AccountFrozenException extends Exception {
/**
 * The message associated with the exception.
 */
    private String message;
/**
 * Constructor to initialize the AccountFrozenException with a message.
 * @param errorMessage
 */
    public AccountFrozenException(final String errorMessage) {
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
