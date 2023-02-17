package Seminar_7;

public class Inspector implements MailService {

    public static final String WEAPONS = "weapons";
    public static final String BANNED_SUBSTANCE = "banned substance";

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            Package checkPac = ((MailPackage) mail).getContent();
            String content = checkPac.getContent();
            if (content.contains(WEAPONS) || content.contains(BANNED_SUBSTANCE)) {
                throw new IllegalPackageException();
            } else if (content.contains("stones")) {
                throw new StolenPackageException();
            }
        }
        return mail;
    }
}
