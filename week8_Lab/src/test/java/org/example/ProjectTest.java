package org.example;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class ProjectTest {

    @Test
    public void testAddUserAndTask() {
        Project project = new Project();
        User user = new User("charlie", "charlie@example.com");
        Task task = new Task("Test code", LocalDate.now().plusDays(1));

        project.addUser(user);
        project.addTask(task);

        assertNotNull(project.getTaskByTitle("Test code"));
    }

    @Test
    public void testGetNonexistentTask() {
        Project project = new Project();
        assertNull(project.getTaskByTitle("Not Found"));
    }
}

