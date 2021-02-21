package osplus.esignanywhere.v4;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Messages
 */
class Messages {
    public static String getMessage(final String key) {
        return getMessage(key, Locale.getDefault());
    }    

    public static String getMessage(final String key, final Locale locale) {
        return ResourceBundle.getBundle("messages", locale).getString(key);
    }    
}
