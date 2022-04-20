package com.dh.movieservice.service.Impl;

import com.dh.movieservice.service.MovieService;
import com.dh.movieservice.entity.Movie;
import com.dh.movieservice.repository.MovieRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record MovieServiceImpl(MovieRepo movieRepo) implements MovieService {
    @Override
    public void saveMovie(Movie movie) {
        movieRepo.save(movie);

    }
    //TODO send notification via RabbitMQ
    @Override
    public List<Movie> getListByGenre(String genre) {
        return movieRepo.findAllByGenre(genre);
    }
}
