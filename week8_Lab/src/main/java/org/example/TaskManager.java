package org.example;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskManager {
    private Map<User, List<Task>> userTasks;

    public TaskManager() {
        this.userTasks = new HashMap<>();
    }

    public void assignTask(User user, Task task) {
        userTasks.putIfAbsent(user, new ArrayList<>());
        if (!userTasks.get(user).contains(task)) {
            userTasks.get(user).add(task);
            user.addTask(task);
        }
    }

    public void removeTask(User user, Task task) {
        if (userTasks.containsKey(user)) {
            userTasks.get(user).remove(task);
        }
    }

    public List<Task> listUserTasks(User user) {
        return userTasks.getOrDefault(user, new ArrayList<>());
    }
}
