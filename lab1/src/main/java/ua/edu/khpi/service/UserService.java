package ua.edu.khpi.service;

import ua.edu.khpi.logger.Logger;
import ua.edu.khpi.model.NotificationType;
import ua.edu.khpi.model.Task;
import ua.edu.khpi.model.User;
import ua.edu.khpi.notification.NotificationHolder;

import java.time.LocalDateTime;

public class UserService {
    private final ProjectService projectService;

    //TODO TASK 3 read this property from file
    private String notificationTypeForUser;
    private final NotificationHolder notificationHolder;

    private final Logger logger;

    public UserService(ProjectService projectService, NotificationHolder notificationHolder, Logger logger) {
        this.projectService = projectService;
        this.notificationHolder = notificationHolder;
        this.logger = logger;
    }

    public void assignTaskToUser(Task task, Integer userId) {
        //1. Get user by id
        //2. Assign task to this user
        //3. Send notification to that user about his new task assignment

        notificationHolder.getNotificationByType(NotificationType.valueOf(notificationTypeForUser))
                .sendNotification(String.format("You %s was assigned to new task %s", userId, task));
    }


    /**
     *
     * TASK 4
     *
     * @param task
     * @param userId
     */
    public void modifyTaskState(Task task, Integer userId) {
        //Change state of task
        //Send notification
        User user = projectService.getUserById(userId);
        logger.log(String.format("User %s modified task state at %s", user, LocalDateTime.now()));
    }
}
