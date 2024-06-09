package com.example.strategyjava.presentation.dtos;

import jakarta.validation.constraints.NotBlank;

public record NotificationRequestDto(
        @NotBlank
        String channel,

        @NotBlank
        String destination,

        @NotBlank
        String message
) {
}
