package com.example.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Optional;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;

import com.example.dto.Movie;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

@Service
public class MovieService {

	public List<Movie> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Movie getMovie(String movieName) throws IOException, UnirestException, ParseException {
		//String linkURL = "http://www.omdbapi.com/?t="+movieName;
		String linkURL = "https://api.themoviedb.org/3/movie/"+movieName+"?api_key=0e548852e5ac6e1e0aac7159c533d7fc";
		
		URL url = new URL(linkURL);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("Accept", "application/json");
		con.connect();
		
		if(con.getResponseCode() != 200) {
			throw new RuntimeException("Connecction Failed: Error code = "+con.getResponseCode());
		}
		/*
		/*HttpResponse<String> requests = Unirest.get("https://box-office-buz1.p.rapidapi.com/search/%7Bsection%7D/Batman")
				.header("x-rapidapi-host", "box-office-buz1.p.rapidapi.com")
				.header("x-rapidapi-key", "gtEygeJHGTmshk2ZAZhttVGn7Qgbp1h8HmHjsn3XIP4kj57IIV")
				.asString();
		
		
		JSONObject obj = request.getBody().getObject();
		ystem.out.println(obj.getString("error"));
		
		System.out.println(requests.getBody()); */
		
		
		String response = "";
		BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
		response = reader.readLine();
		while((reader.readLine()) != null) {
			response+= reader.readLine(); 
			System.out.println(response);
		}
		
		System.out.println("RESPONSE BEFORE PRINTING---"+response);
		
		JSONParser parser = new JSONParser();
		JSONObject json = (JSONObject)parser.parse(response);
		
		
		Movie movie = new Movie();
		movie.setTitle((String) json.get("original_title"));
		movie.setPlot((String) json.get("overview"));
		movie.setYear((String) json.get("release_date"));
		//System.out.println(responses.toString());
		
		return movie;
	}

}
