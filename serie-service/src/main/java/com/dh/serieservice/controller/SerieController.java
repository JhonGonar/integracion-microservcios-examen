package com.dh.serieservice.controller;

import com.dh.serieservice.entity.Serie;
import com.dh.serieservice.service.SerieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/series")
public record SerieController(SerieService serieService) {

    @GetMapping("{genre}")
    public List<Serie> listByGenre(@PathVariable("genre") String genre ){
        return serieService.getListByGenre(genre);
    }

    @PostMapping
    public void newSerie(@RequestBody Serie serie){
        log.info("new series registration, {}", serie);
        serieService.saveNewSerie(serie);
    }
}
