package com.dh.serieservice.service;

import com.dh.serieservice.entity.Serie;

import java.util.List;

public interface SerieService {
    List<Serie> getListByGenre(String genre);

    void saveNewSerie(Serie serie);
}
