package manage.store.domain.exception;

public class DatabaseOperationException extends RuntimeException {
    public DatabaseOperationException(String message) {
        super(message);
    }

    public DatabaseOperationException() {
        super("Database operation failed");
    }

    public DatabaseOperationException(String message, Throwable cause) {
        super(message, cause);
    }
}
