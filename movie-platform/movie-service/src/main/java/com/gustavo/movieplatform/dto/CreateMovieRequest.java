package com.gustavo.movieplatform.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CreateMovieRequest(
        @NotBlank String title,
        @NotNull Integer year,
        @NotBlank String genre
) {
}
