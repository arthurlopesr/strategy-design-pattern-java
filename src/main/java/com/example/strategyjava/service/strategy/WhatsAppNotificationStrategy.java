package com.example.strategyjava.service.strategy;

import com.example.strategyjava.service.NotificationStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WhatsAppNotificationStrategy implements NotificationStrategy {
    private final Logger logger = LoggerFactory.getLogger(WhatsAppNotificationStrategy.class);

    @Override
    public void sendNotification(String destination, String message) {
        logger.info("Notificação [{}] enviada para o whatsapp [{}]", message, destination);
    }
}
