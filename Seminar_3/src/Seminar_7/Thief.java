package Seminar_7;

public class Thief implements MailService {
    private int stolenSum = 0;
    private int minPrice = 0;

    public Thief(int minPrice) {
        this.minPrice = minPrice;
    }

    public int getStolenValue() {
        return this.stolenSum;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            Package pacThief = ((MailPackage) mail).getContent();
            if (pacThief.getPrice() >= minPrice) {
                stolenSum += pacThief.getPrice();
                mail = new MailPackage(mail.getFrom(), mail.getTo(), new Package("stones instead of " + pacThief.getContent(), 0));
                return mail;
            }
            return mail;
        }
        return mail;
    }
}