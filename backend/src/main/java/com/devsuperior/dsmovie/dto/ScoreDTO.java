package com.devsuperior.dsmovie.dto;

public class ScoreDTO {

	private Long movieId;
	private String email;
	private double Score;
	
	public ScoreDTO() {
		
	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getScore() {
		return Score;
	}

	public void setScore(double score) {
		Score = score;
	}
	
	
	
}
