package com.gustavo.movieplatform.controller;

import com.gustavo.movieplatform.exception.MovieNotFoundException;
import com.gustavo.movieplatform.model.Movie;
import com.gustavo.movieplatform.service.MovieService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.gustavo.movieplatform.dto.CreateMovieRequest;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService){
     this.movieService = movieService;
    }

   @GetMapping("/movies")
    public List<Movie> getMovies(){
        return movieService.getMovies();
   }

   @GetMapping("/movies/{id}")
    public Movie getMovieById(@PathVariable Long id){
        return movieService.getMovieById(id).orElseThrow(() -> new MovieNotFoundException(id));
   }

   @PostMapping("/movies")
    public Movie createMovie(@Valid @RequestBody CreateMovieRequest request){
        return movieService.createMovie(
                request.title(),
                request.year(),
                request.genre()
        );
   }
}
