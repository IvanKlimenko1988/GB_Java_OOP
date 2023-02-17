package Seminar_7;

import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        MailService spy = new Spy(logger.getLogger(Class.class.getName()));
        MailService thief = new Thief(10);
        MailService inspector = new Inspector();
        MailService[] msArray = {spy, thief, inspector};
        MailMessage mail1 = new MailMessage("Romeo", "Juliet", "I love you!");
        MailMessage mail2 = new MailMessage("Austin Powers", "James Bond", "Big secret!");
        MailPackage mail3 = new MailPackage("Romeo", "Juliet", new Package("Flowers", 15));
        MailPackage mail4 = new MailPackage("Romeo", "Juliet", new Package("Flowers", 25));
        MailPackage mail5 = new MailPackage("Austin Powers", "James Bond", new Package("weapons", 5));
        UntrustworthyMailWorker umw = new UntrustworthyMailWorker(msArray);
        try {
            umw.processMail(mail1);
        } catch (RuntimeException e) {
        }
        try {
            umw.processMail(mail2);
        } catch (RuntimeException e) {
        }
        try {
            umw.processMail(mail3);
        } catch (RuntimeException e) {
        }
        try {
            umw.processMail(mail4);
        } catch (RuntimeException e) {
        }
        try {
            umw.processMail(mail5);
        } catch (RuntimeException e) {
        }
        System.out.println("Thief have stolen $" + ((Thief) thief).getStolenValue() + "!");
    }
}
