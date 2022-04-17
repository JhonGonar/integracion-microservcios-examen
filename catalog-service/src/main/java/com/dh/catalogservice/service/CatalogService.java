package com.dh.catalogservice.service;


import com.dh.catalogservice.entity.Pattern;
import com.dh.catalogservice.entity.Serie;

import java.util.List;

public interface CatalogService {
    List<? extends Pattern> getCatalogByGenre(String genre);
    void saveNewMedia(Serie obj);
}
