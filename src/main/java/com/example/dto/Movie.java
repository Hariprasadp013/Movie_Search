package com.example.dto;

public class Movie {
	private String title;
	private String year;
	private String runtime;
	private String genre;
	private String director;
	private String actors;
	private String plot;
	private float rating;
	private String posterLink;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getRuntime() {
		return runtime;
	}
	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActors() {
		return actors;
	}
	public void setActors(String actors) {
		this.actors = actors;
	}
	public String getPlot() {
		return plot;
	}
	public void setPlot(String plot) {
		this.plot = plot;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public String getPosterLink() {
		return posterLink;
	}
	public void setPosterLink(String posterLink) {
		this.posterLink = posterLink;
	}
	@Override
	public String toString() {
		return "Movie [title=" + title + ", year=" + year + ", runtime=" + runtime + ", genre=" + genre + ", director="
				+ director + ", actors=" + actors + ", plot=" + plot + ", rating=" + rating + "]";
	}
	
	
	
	

}
