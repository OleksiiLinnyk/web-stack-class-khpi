package khpi.notification;

import khpi.model.NotificationType;

import java.util.HashMap;
import java.util.Map;

/**
 * TASK 2
 */
public class NotificationHolder {
    private final Map<NotificationType, Notification> notifications = new HashMap<>();

    {
        notifications.put(NotificationType.EMAIL, new EmailNotification());
        notifications.put(NotificationType.MESSENGER, new MessengerNotification());
        notifications.put(NotificationType.SMS, new SMSNotification());
    }

    public Notification getNotificationByType(NotificationType notificationType) {
        return notifications.getOrDefault(notificationType, new EmailNotification());
    }
}