package by.epamtc.poliukov.task03.task1.exception;

public class NonValidArrayException extends Exception {
    public NonValidArrayException() {
        super();
    }

    public NonValidArrayException(String message) {
        super(message);
    }

    public NonValidArrayException(String message, Throwable cause) {
        super(message, cause);
    }

    public NonValidArrayException(Throwable cause) {
        super(cause);
    }
}
