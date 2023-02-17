
package Seminar_7;

import java.util.logging.Logger;

public class Spy implements MailService {
    public static final String AUSTIN_POWERS = "Austin Powers";
    private Logger logger;

    public Spy(Logger logger) {
        this.logger = logger;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailMessage) {
            String from = mail.getFrom();
            String to = mail.getTo();
            String message = ((MailMessage) mail).getMessage();
            if (mail.getFrom().equals(AUSTIN_POWERS) || mail.getTo().equals(AUSTIN_POWERS)) {
                logger.warning("Detected target mail correspondence: from " +
                        from + " to " + to + " \"" + message + "\"");
            } else {
                logger.info("Usual correspondence: from " +
                        from + " to " + to);
            }
        }
        return mail;
    }
}
