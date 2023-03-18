package ua.edu.khpi.notification;

/**
 * TASK 2
 */
public class SMSNotification implements Notification {

    @Override
    public void sendNotification(String message) {
        System.out.println("Send sms notification " + message);
    }
}
