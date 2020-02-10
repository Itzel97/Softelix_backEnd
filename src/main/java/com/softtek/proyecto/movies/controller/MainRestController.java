package com.softtek.proyecto.movies.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.softtek.proyecto.movies.entity.Classification;
import com.softtek.proyecto.movies.service.ClassificationService;


//@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
//@RequestMapping("/api")
public class MainRestController {
	
//	private final Logger log = LoggerFactory.getLogger(MainRestController.class);

	@Autowired
	private ClassificationService classificationService;
	

	
	@GetMapping (value = "/classification")
	public List<Classification> getClassifications(){
		return classificationService.AllClassifications();
	}
	
//	@GetMapping (value = "/movie/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
//	public Movie getMovieById(@PathVariable("id") Integer id){
//		return movieService.getMovieById(id);
//	}
//	
//	@PostMapping (value = "/movie/", produces = MediaType.APPLICATION_JSON_VALUE)
//	public Movie addMovie(@RequestBody Movie requestBody){
//		return movieService.addMovie(requestBody);
//	}
//	
//	@PutMapping(value = "/movie/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//	 public Movie updateUser(@PathVariable("id") String username, @RequestBody Movie requestBody) {
//		 return movieService.updateMovie(requestBody);
//	 }
//	
//	@DeleteMapping(value = "/delete/movie/{id}/")
//	public void deleteUser(@PathVariable("id") Integer id) {
//		movieService.deleteMovieById(id);
//	}
//	
//	@GetMapping (value = "/director/", produces = MediaType.APPLICATION_JSON_VALUE)
//	public List<Director> getDirectorList(){
//		return directorService.getAllDirectors();
//	}

}
