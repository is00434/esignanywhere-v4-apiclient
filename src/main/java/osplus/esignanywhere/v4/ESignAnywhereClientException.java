package osplus.esignanywhere.v4;

import osplus.esignanywhere.v4.model.Error;

/**
 * ESignAnywhereClientException
 */
public class ESignAnywhereClientException extends RuntimeException {

    private static final long serialVersionUID = -1920353173293352284L;

    private Error error = null;

    public ESignAnywhereClientException(final String msg) {
        super(msg);
    }

    public ESignAnywhereClientException(final String msg, final Throwable cause) {
        super(msg, cause);
    }

    public ESignAnywhereClientException(final int httpStatus, final String message) {
        this("HTTP-Status: " + httpStatus + ", " + message);
    }

    public ESignAnywhereClientException(final int httpStatus, final Error error) {
        this("HTTP-Status: " + httpStatus + ", " + error);
        this.error = error;
    }

    public boolean hasESignAnywhereError() {
        return error != null;
    }

    public Error getESignAnywhereError() {
        return error;
    }
}
