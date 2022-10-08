package ua.edu.khpi.model;

import java.util.List;

/**
 * TASK 1
 *
 */
public class User {

    private Integer id;
    private String name;
    private List<Task> tasks;

    private UserRole userRole;
    public User() {
    }

    public User(Integer id, String name, List<Task> tasks, UserRole userRole) {
        this.id = id;
        this.name = name;
        this.tasks = tasks;
        this.userRole = userRole;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tasks=" + tasks +
                '}';
    }
}
