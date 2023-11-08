package com.movie.moviedashboard.service;

import com.movie.moviedashboard.entity.Movie;
import com.movie.moviedashboard.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovie() {
        List<Movie> movies = movieRepository.findAll();
        return movies;
    }

    public String addMovie(Movie movie) {
        Movie addedMovie = movieRepository.save(movie);
        return "Movie added successfully with Id"+addedMovie.getMovieId();
    }
}
