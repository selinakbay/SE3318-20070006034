package org.example;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TaskManagerTest {

    @Test
    public void testAssignAndListTasks() {
        TaskManager manager = new TaskManager();
        User user = new User("eva", "eva@example.com");
        Task task = new Task("Deploy app", LocalDate.now().plusDays(2));

        manager.assignTask(user, task);
        List<Task> tasks = manager.listUserTasks(user);

        assertEquals(1, tasks.size());
        assertEquals("Deploy app", tasks.get(0).getTitle());
    }

    @Test
    public void testRemoveTask() {
        TaskManager manager = new TaskManager();
        User user = new User("frank", "frank@example.com");
        Task task = new Task("Clean DB", LocalDate.now().plusDays(1));

        manager.assignTask(user, task);
        manager.removeTask(user, task);

        assertTrue(manager.listUserTasks(user).isEmpty());
    }
}

