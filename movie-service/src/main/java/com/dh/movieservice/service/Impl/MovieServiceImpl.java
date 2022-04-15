package com.dh.movieservice.service.Impl;

import com.dh.movieservice.service.MovieService;
import com.dh.movieservice.entity.Movie;
import com.dh.movieservice.repository.MovieRepo;
import org.springframework.stereotype.Service;

@Service
public record MovieServiceImpl(MovieRepo movieRepo) implements MovieService {
    @Override
    public void saveMovie(Movie movie) {
        movieRepo.save(movie);
        //TODO send notification via RabbitMQ
    }
}
