package khpi;

public class EmailNotification implements Notification {

    private final String adminEmail;

    public EmailNotification(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    @Override
    public void send(String title, String message) {
        System.out.printf("Send email with %s to email %s message = %s%n", title, adminEmail, message);
    }
}
