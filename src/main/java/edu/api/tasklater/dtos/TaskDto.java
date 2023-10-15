package edu.api.tasklater.dtos;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record TaskDto(
        @NotBlank String title,
        String description,
        String priority,

        @NotNull LocalDateTime startAt,
        @Nullable LocalDateTime endAt
) {
}
