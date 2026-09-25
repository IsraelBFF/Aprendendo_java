package exceptions;

public class accountException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public accountException(String msg) {
        super(msg);
    }
}
