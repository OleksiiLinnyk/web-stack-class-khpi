package ua.edu.khpi.notification;

/**
 * TASK 2
 */
public class EmailNotification implements Notification {

    @Override
    public void sendNotification(String message) {
        System.out.println("Send email notification " + message);
    }
}
