package org.example;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    public void testUserCreationAndAddTask() {
        User user = new User("alice", "alice@example.com");
        Task task = new Task("Read book", LocalDate.now().plusDays(2));

        user.addTask(task);
        assertTrue(user.hasTask(task));
        assertEquals(1, user.getTasks().size());
    }

    @Test
    public void testDuplicateTaskNotAdded() {
        User user = new User("bob", "bob@example.com");
        Task task = new Task("Read book", LocalDate.now().plusDays(2));

        user.addTask(task);
        user.addTask(task);
        assertEquals(1, user.getTasks().size());
    }
}

