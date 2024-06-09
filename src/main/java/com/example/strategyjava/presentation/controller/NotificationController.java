package com.example.strategyjava.presentation.controller;

import com.example.strategyjava.presentation.dtos.NotificationRequestDto;
import com.example.strategyjava.service.NotificationService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/notifications")
public class NotificationController {

    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping
    public ResponseEntity<Void> send(@RequestBody @Valid NotificationRequestDto requestDto) {
        notificationService.notify(
                requestDto.channel(),
                requestDto.destination(),
                requestDto.message()
        );
        return ResponseEntity.accepted().build();
    }
}
