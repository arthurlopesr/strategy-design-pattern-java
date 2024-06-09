package com.example.strategyjava.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    private final Logger logger = LoggerFactory.getLogger(NotificationService.class);

    public void notify(String channel, String destination, String message) {

        if (channel.equalsIgnoreCase("discord")) {
            logger.info("Notificação [{}] enviada para o Discord [{}]", message, destination);

        } else if (channel.equalsIgnoreCase("instagram")) {
            logger.info("Notificação [{}] enviada para o instagram [{}]", message, destination);

        } else if (channel.equalsIgnoreCase("twitter")) {
            logger.info("Notificação [{}] enviada para o twitter [{}]", message, destination);

        } else if (channel.equalsIgnoreCase("whatsapp")) {
            logger.info("Notificação [{}] enviada para o whatsapp [{}]", message, destination);
        }
    }
}
