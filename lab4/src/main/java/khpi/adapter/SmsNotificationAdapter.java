package khpi.adapter;

import khpi.Notification;
import khpi.UserInformation;

public class SmsNotificationAdapter implements Notification {
    private final UserInformation userInformation;


    public SmsNotificationAdapter(UserInformation userInformation) {
        this.userInformation = userInformation;
    }

    @Override
    public void send(String title, String message) {
        System.out.printf("Your name %s and phone %s%n", userInformation.getSenderName(), userInformation.getPhone());
        System.out.printf("You send a message with title %s message body %s%n", title, message);
    }
}
