package session4practice3exception;

public class CustomFileNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	public CustomFileNotFoundException(String message, Throwable cause) {
        super(message, cause); // Pass the message and cause to the parent Exception class
    }
}
