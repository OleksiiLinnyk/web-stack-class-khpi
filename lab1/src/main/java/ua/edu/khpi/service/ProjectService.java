package ua.edu.khpi.service;

import ua.edu.khpi.model.NotificationType;
import ua.edu.khpi.model.Project;
import ua.edu.khpi.model.User;
import ua.edu.khpi.notification.NotificationHolder;

import java.util.List;

public class ProjectService {

    private final Project project;
    private final NotificationHolder notificationHolder;

    //TODO read this property from file
    private String notificationTypeForAdmin;

    public ProjectService(Project project, NotificationHolder notificationHolder) {
        this.project = project;
        this.notificationHolder = notificationHolder;
    }

    public Project getProject() {
        return project;
    }

    public List<User> getAllUsersAssignedToProject() {return project.getUsers();}
    public User getUserById(Integer id) {

        //Filter list of users to find needed user
        return new User();
    }

    /**
     * TASK 5
     * @param user
     */
    public void addUserToProject(User user) {
        //1.Get list of all users
        //2.Add user to list
        //3.Update list in project
        //4.Send notification
        notificationHolder.getNotificationByType(NotificationType.valueOf(notificationTypeForAdmin))
                .sendNotification(String.format("New user %s was added to the project", user));
    }
}
