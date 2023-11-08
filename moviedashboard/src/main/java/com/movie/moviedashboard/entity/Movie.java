package com.movie.moviedashboard.entity;

import com.movie.moviedashboard.model.MovieLookUp;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
//import javax.persistence.Entity;
//import javax.persistence.Id;
import jakarta.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Movie {
    @Id
    Integer movieId;
    String movieTitle;
    String Genre;
    String rating;
    String YOR;
    String runtime;
    String dateOfRelease;

    public static MovieLookUp prepareMovieLookUp(Movie movie) {
        MovieLookUp movieLookUp  = new MovieLookUp();
        movieLookUp.setMovieId(movie.getMovieId());
        movieLookUp.setMovieTitle(movie.getMovieTitle());
        movieLookUp.setGenre(movie.getGenre());
        movieLookUp.setRating(movie.getRating());
        movieLookUp.setYOR(movie.getYOR());
        movieLookUp.setRuntime(movie.getRuntime());
        movieLookUp.setDateOfRelease(movie.getDateOfRelease());
        return movieLookUp;
    }
}
