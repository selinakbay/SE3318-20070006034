package org.example;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {

    @Test
    public void testNormalTaskCreationAndCompletion() {
        Task task = new Task("Do Homework", LocalDate.now().plusDays(1));
        assertEquals("Do Homework", task.getTitle());
        assertFalse(task.isCompleted());
        assertFalse(task.isOverdue());

        task.markCompleted();
        assertTrue(task.isCompleted());
    }

    @Test
    public void testOverdueTask() {
        Task task = new Task("Missed Task", LocalDate.now().minusDays(1));
        assertTrue(task.isOverdue());
    }
}
