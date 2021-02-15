package osplus.esignanywhere.v4;

/**
 * ESignAnywhereClientException
 */
public class ESignAnywhereClientException extends RuntimeException {

    private static final long serialVersionUID = -1920353173293352284L;

    public ESignAnywhereClientException(final String msg) {
        super(msg);
    }

    public ESignAnywhereClientException(final String msg, final Throwable cause) {
        super(msg, cause);
    }

    public ESignAnywhereClientException(final int httpStatus, final String message) {
        this("HTTP-Status: " + httpStatus + ", " + message);
    }
}
