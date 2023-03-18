package khpi.model;

import java.util.List;

/**
 * TASK 1
 *
 */
public class Project {

    private User admin;
    private List<User> users;
    private List<Task> tasks;

    public Project() {
    }

    public Project(User admin, List<User> users, List<Task> tasks) {
        this.admin = admin;
        this.users = users;
        this.tasks = tasks;
    }

    public User getAdmin() {
        return admin;
    }

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
