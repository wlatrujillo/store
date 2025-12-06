package com.codewithmosh.store;

import org.springframework.stereotype.Component;

@Component
public class NotificationManager {

    private final NotificationService notificationService;

    public NotificationManager(NotificationService notificationService){
        this.notificationService = notificationService;
    }

    void sendNotification(String message){
        notificationService.send(message);
    }
}
