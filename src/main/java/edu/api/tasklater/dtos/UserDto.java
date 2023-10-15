package edu.api.tasklater.dtos;

import jakarta.validation.constraints.NotBlank;

public record UserDto(
        @NotBlank String username,
        @NotBlank String name,
        @NotBlank String password
) {
}
