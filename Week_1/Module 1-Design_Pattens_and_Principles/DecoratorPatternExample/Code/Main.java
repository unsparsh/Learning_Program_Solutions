package Code;

public class Main {
    public static void main(String[] args) {
        // Base notifier
        Notifier emailNotifier = new EmailNotifier();

        // Decorated with SMS
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);

        System.out.println("Multi-channel Notification:");
    }
}
