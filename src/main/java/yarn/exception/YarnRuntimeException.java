package yarn.exception;

/**
 * Created by wei on 16/4/23.
 */
public class YarnRuntimeException extends RuntimeException {

    private static final long serialVersionUID = -7153142425412203936L;
    public YarnRuntimeException(Throwable cause) { super(cause); }
    public YarnRuntimeException(String message) { super(message); }
    public YarnRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}