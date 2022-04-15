package com.dh.serieservice.service.impl;

import com.dh.serieservice.entity.Serie;
import com.dh.serieservice.repository.SerieRepository;
import com.dh.serieservice.service.SerieService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record SerieServiceImpl(SerieRepository serieRepository) implements SerieService{

    @Override
    public List<Serie> getListByGenre(String genre) {
        return serieRepository.findAllByGenre(genre);
    }

    @Override
    public void saveNewSerie(Serie serie) {
        serieRepository.save(serie);
        //TODO send notification to RabbitMQ
    }
}
