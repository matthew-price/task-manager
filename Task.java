public class Task {

    private String taskName = "";
    private String description = "";
    private String priority = "";

    public Task(String taskName, String description, String priority) {
        this.taskName = taskName;
        this.description = description;
        this.priority = priority;
    }

    public String getTaskName(){
        return this.taskName;
    }

    public String getDescription(){
        return description;
    }

    public String getPriority(){
        return priority;
    }

}
