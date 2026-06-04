 package com.gustavo.movieplatform.service;

import com.gustavo.movieplatform.model.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

 @Service
public class MovieService {
     private final List<Movie> movies = new ArrayList<>();

     public MovieService(){
            movies.add(new Movie(1L, "The Matrix", 1999, "Sci-Fi"));
            movies.add(new Movie(2L, "Interstellar", 2014, "Sci-Fi"));
     }

     public List<Movie> getMovies(){
        return movies;
    }

    public Optional<Movie> getMovieById(Long id){
        return movies.stream().filter(movie -> movie.id().equals(id)).findFirst();
    }

    public Movie createMovie(String title, Integer year, String genre){
         Long nextId = (long) (movies.size() + 1);

         Movie movie = new Movie(nextId, title, year, genre);

         movies.add(movie);

         return movie;
    }
}
