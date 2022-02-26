package com.teste.MoviesBattle.Model;

import java.text.NumberFormat;
import java.text.ParseException;

public class Movie {
	
	private String imdbID;
	private String Title;
	private String imdbVotes;
	private String Type;
	private double imdbRating;
	public String Poster;
	
	
	public String getID() { 
		return this.imdbID;
	}
	public String getTitle() { 
		return this.Title;
	}
	public double getimdbScore() throws ParseException { 
		if (this.imdbVotes != "N/A") {
			int votes = NumberFormat.getNumberInstance(java.util.Locale.US).parse(this.imdbVotes).intValue();
			return votes*this.imdbRating;
		}
		else
		return 0;
	}
	public String getType() { 
		return this.Type;
	}
}
