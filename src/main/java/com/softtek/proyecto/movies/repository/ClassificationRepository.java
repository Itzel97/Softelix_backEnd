package com.softtek.proyecto.movies.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.softtek.proyecto.movies.entity.Classification;

@Repository
public interface ClassificationRepository extends CrudRepository<Classification,Integer>{

}
