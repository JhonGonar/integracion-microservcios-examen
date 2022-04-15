package com.dh.movieservice.repository;

import com.dh.movieservice.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//TODO dockerize db
@Repository
public interface MovieRepo extends JpaRepository<Movie, Integer> {
}
