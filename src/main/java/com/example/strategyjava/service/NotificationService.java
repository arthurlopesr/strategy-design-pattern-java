package com.example.strategyjava.service;

import com.example.strategyjava.service.strategy.DiscordNotificationStrategy;
import com.example.strategyjava.service.strategy.InstagramNotificationStrategy;
import com.example.strategyjava.service.strategy.TwitterNotificationStrategy;
import com.example.strategyjava.service.strategy.WhatsAppNotificationStrategy;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class NotificationService {

    private final Map<String, NotificationStrategy> strategyMap = Map.of(
            "discord", new DiscordNotificationStrategy(),
            "instagram", new InstagramNotificationStrategy(),
            "twitter", new TwitterNotificationStrategy(),
            "whatsapp", new WhatsAppNotificationStrategy()
    );

    public void notify(String channel, String destination, String message) {
        strategyMap.get(channel).sendNotification(destination, message);
    }
}
