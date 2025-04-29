package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class NotificationServiceTest {

    @Test
    public void testSendAndRetrieveNotification() {
        NotificationService service = new NotificationService();
        User user = new User("dana", "dana@example.com");

        service.sendNotification(user, "You have a task!");
        List<String> notifications = service.getNotifications(user);

        assertEquals(1, notifications.size());
        assertEquals("You have a task!", notifications.get(0));
    }

    @Test
    public void testEmptyNotificationsForNewUser() {
        NotificationService service = new NotificationService();
        User user = new User("newUser", "new@example.com");

        List<String> notifications = service.getNotifications(user);
        assertTrue(notifications.isEmpty());
    }
}

