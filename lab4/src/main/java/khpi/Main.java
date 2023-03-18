package khpi;

import khpi.adapter.SlackNotificationAdapter;
import khpi.adapter.SmsNotificationAdapter;

public class Main {

    public static void main(String[] args) {
        Notification emailNotification = new EmailNotification("adminEmail@gmail.com");
        Notification slackNotification = new SlackNotificationAdapter(new SlackConnector("admin", "12443", "myChatId"));
        Notification smsNotification = new SmsNotificationAdapter(new UserInformation("1234567890", "Oleksii"));


        emailNotification.send("Invitation to meeting", "You are invited to java news overview meeting");
        slackNotification.send(null, "Hi, guys");
        smsNotification.send("Call me back, please", "Hey man, I have not enough money for a call. Can you call me back, please?");
    }
}
