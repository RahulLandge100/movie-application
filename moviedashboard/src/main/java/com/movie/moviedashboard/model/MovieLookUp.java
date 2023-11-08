package com.movie.moviedashboard.model;

import com.movie.moviedashboard.entity.Movie;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MovieLookUp {
    Integer movieId;
    String movieTitle;
    String genre;
    String rating;
    String YOR;
    String runtime;
    String dateOfRelease;

    public static Movie prepareMovie(MovieLookUp movieLookUp) {
        Movie movie = new Movie();
        movie.setMovieId(movieLookUp.getMovieId());
        movie.setMovieTitle(movieLookUp.getMovieTitle());
        movie.setGenre(movieLookUp.getGenre());
        movie.setRating(movieLookUp.getRating());
        movie.setYOR(movieLookUp.getYOR());
        movie.setRuntime(movieLookUp.getRuntime());
        movie.setDateOfRelease(movieLookUp.getDateOfRelease());
        return movie;
    }
}
