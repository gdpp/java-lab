package com.gustavo.movieplatform.model;

public record Movie(
        Long id,
        String title,
        Integer year,
        String genre
) {
}
