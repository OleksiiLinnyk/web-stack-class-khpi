package khpi.model;

/**
 * TASK 1
 *
 */
public class Task {

    private String name;
    private TaskState taskState;

    public Task() {
    }

    public Task(String name, TaskState taskState) {
        this.name = name;
        this.taskState = taskState;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TaskState getTaskState() {
        return taskState;
    }

    public void setTaskState(TaskState taskState) {
        this.taskState = taskState;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", taskState=" + taskState +
                '}';
    }
}
