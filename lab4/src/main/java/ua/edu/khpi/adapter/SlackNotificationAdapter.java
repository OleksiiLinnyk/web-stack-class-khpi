package ua.edu.khpi.adapter;

import ua.edu.khpi.Notification;
import ua.edu.khpi.SlackConnector;

public class SlackNotificationAdapter implements Notification {

    private final SlackConnector slackConnector;



    public SlackNotificationAdapter(SlackConnector slackConnector) {
        this.slackConnector = slackConnector;
    }

    @Override
    public void send(String title, String message) {
        slackConnector.connectToSlack();
        System.out.printf("You %s posted message to the chat %s%n", slackConnector.getLogin(), message);
    }
}
