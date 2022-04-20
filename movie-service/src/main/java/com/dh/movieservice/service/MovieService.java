package com.dh.movieservice.service;


import com.dh.movieservice.entity.Movie;

import java.util.List;

public interface MovieService {
    void saveMovie(Movie movie);

    List<Movie> getListByGenre(String genre);
}
