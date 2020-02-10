package com.softtek.proyecto.movies.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.proyecto.movies.entity.Classification;
import com.softtek.proyecto.movies.repository.ClassificationRepository;

@Service
public class ClassificationService {
	
	public ClassificationRepository classificationRepository;
	
	@Autowired
	public ClassificationService(ClassificationRepository classificationRepository) {
		this.classificationRepository=classificationRepository;
	}
	
	public List<Classification> AllClassifications(){
		return(List<Classification>)classificationRepository.findAll();
	}
}
