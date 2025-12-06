package com.codewithmosh.store;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("sms")
@Primary
public class SMSNotificationService implements NotificationService{
    @Override
    public void send(String message) {
        System.out.println(message);
        System.out.println("SMS sent successfully");
    }
}
