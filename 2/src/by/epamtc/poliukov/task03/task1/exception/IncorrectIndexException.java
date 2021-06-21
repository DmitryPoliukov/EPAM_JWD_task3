package by.epamtc.poliukov.task03.task1.exception;

public class IncorrectIndexException extends Exception{
    public IncorrectIndexException() {
        super();
    }

    public IncorrectIndexException(String message) {
        super(message);
    }

    public IncorrectIndexException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectIndexException(Throwable cause) {
        super(cause);
    }
}
