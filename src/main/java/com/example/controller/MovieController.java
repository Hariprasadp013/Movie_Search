package com.example.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.Movie;
import com.example.service.MovieService;
import com.mashape.unirest.http.exceptions.UnirestException;

@RestController
@RequestMapping("/rest")
public class MovieController {
	
	@Autowired
	MovieService ms;
	
	@RequestMapping("/all")
	public List<Movie> getAll(){
		return ms.getAll();
	}
	@RequestMapping("/movies/{name}")
	public Movie getMovie(@PathVariable("movieName") String key) throws IOException, UnirestException, ParseException{
		return ms.getMovie(key);
	}

}
