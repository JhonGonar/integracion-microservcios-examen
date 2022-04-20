package com.dh.movieservice.controller;

import com.dh.movieservice.service.MovieService;
import com.dh.movieservice.entity.Movie;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//TODO Implement OAuth2.o from ApiGW
//TODO Reduce path to endpoint just to movies
@RestController
@Slf4j
@RequestMapping("/movies")
public record MovieController(MovieService movieService) {

    @GetMapping("{genre}")
    public List<Movie> listByGenre(@PathVariable("genre") String genre){
        return movieService.getListByGenre(genre);
    }

    @PostMapping
    public void newMovie(@RequestBody Movie movie){
        log.info("new movie registration, {}", movie);
        movieService.saveMovie(movie);
    }
}
