package com.movie.moviedashboard.repository;

import com.movie.moviedashboard.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepositoryImplementation<Movie, Integer> {

}
