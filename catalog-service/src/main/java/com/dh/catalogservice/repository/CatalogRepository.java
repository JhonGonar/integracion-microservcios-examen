package com.dh.catalogservice.repository;


import com.dh.catalogservice.entity.Pattern;
import com.dh.catalogservice.entity.Serie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogRepository extends MongoRepository<Serie, String> {

}
