package com.dh.catalogservice.service.impl;

import com.dh.catalogservice.entity.Pattern;
import com.dh.catalogservice.entity.Serie;
import com.dh.catalogservice.repository.CatalogRepository;
import com.dh.catalogservice.repository.FeignSerie;
import com.dh.catalogservice.service.CatalogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record CatalogServiceImpl(FeignSerie feignSerie, CatalogRepository catalogRepository) implements CatalogService {

    @Override
    public List<? extends Pattern> getCatalogByGenre(String genre) {
        return feignSerie.listByGenre(genre);
    }

    @Override
    public void saveNewMedia(Serie obj) {
        catalogRepository.save(obj);
    }
}
