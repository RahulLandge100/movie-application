package com.movie.moviedashboard.controller;

import com.movie.moviedashboard.entity.Movie;
import com.movie.moviedashboard.model.MovieLookUp;
import com.movie.moviedashboard.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping("/add-movies")
    public String addMovie(@RequestBody Movie movie) {
        String response = movieService.addMovie(movie);
        return response;
    }

    @GetMapping("/get-All-Movies")
    public List<MovieLookUp> getAllMovie() {
        List<Movie> movies = movieService.getAllMovie();
        List<MovieLookUp> movieLookUpsList = new ArrayList<>();
        for (Movie movie : movies) {
            MovieLookUp movieLookUps = Movie.prepareMovieLookUp(movie);
            movieLookUpsList.add(movieLookUps);
        }
        return movieLookUpsList;
    }
}
