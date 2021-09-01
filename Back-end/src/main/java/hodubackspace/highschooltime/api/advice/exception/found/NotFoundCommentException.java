package hodubackspace.highschooltime.api.advice.exception.found;

public class NotFoundCommentException extends RuntimeException{
    public NotFoundCommentException() {
        super();
    }

    public NotFoundCommentException(String message) {
        super(message);
    }

    public NotFoundCommentException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotFoundCommentException(Throwable cause) {
        super(cause);
    }

    protected NotFoundCommentException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
