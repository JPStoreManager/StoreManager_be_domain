package manage.store.domain.exception.common;

public class InvalidParameterException extends RuntimeException {
    public InvalidParameterException(String message) {
        super(message);
    }

    public InvalidParameterException() {
        super("Illegal Parameter");
    }
}
