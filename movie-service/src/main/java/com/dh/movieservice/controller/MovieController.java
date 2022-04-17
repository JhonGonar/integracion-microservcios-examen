package com.dh.movieservice.controller;

import com.dh.movieservice.service.MovieService;
import com.dh.movieservice.entity.Movie;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//TODO Implement OAuth2.o from ApiGW
//TODO Reduce path to endpoint just to movies
@RestController
@Slf4j
@RequestMapping("/movies")
public record MovieController(MovieService movieService) {

    @PostMapping
    public void newMovie(@RequestBody Movie movie){
        log.info("new movie registration, {}", movie);
        movieService.saveMovie(movie);
    }
}
