package org.example;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationService {
    private Map<User, List<String>> notifications;

    public NotificationService() {
        this.notifications = new HashMap<>();
    }

    public void sendNotification(User user, String message) {
        notifications.putIfAbsent(user, new ArrayList<>());
        notifications.get(user).add(message);
    }

    public List<String> getNotifications(User user) {
        return notifications.getOrDefault(user, new ArrayList<>());
    }
}
