package com.dh.catalogservice.repository;

import com.dh.catalogservice.entity.Movie;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//TODO waiting for clarificatio to see if need it
@FeignClient("movie-service")
public interface FeingMovie {
    @GetMapping("/movies/{genre}")
    List<Movie> listByGenre(@PathVariable("genre") String genre);
}
