package ua.edu.khpi.notification;

/**
 * TASK 2
 */
public class MessengerNotification implements Notification {

    @Override
    public void sendNotification(String message) {
        System.out.println("Send messenger notification " + message);
    }
}
