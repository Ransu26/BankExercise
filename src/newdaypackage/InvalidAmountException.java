package newdaypackage;
/**
 * Custom exception class to indicate an
 * invalid amount in a bank account operation.
 */
public class InvalidAmountException extends Exception {
/**
 * The message associated with the exception.
 */
    private String message;
/**
 * Constructor to initialize the InvalidAmountException with a message.
 * @param errorMessage
 */
    public InvalidAmountException(final String errorMessage) {
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
