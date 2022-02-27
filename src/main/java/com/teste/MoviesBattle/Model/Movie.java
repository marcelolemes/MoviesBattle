package com.teste.MoviesBattle.Model;

import java.text.NumberFormat;
import java.text.ParseException;

public class Movie {
	
	private String imdbID;
	private String Title;
	private String imdbVotes;
	private String Type;
	private String imdbRating;
	public String Poster;
	
	
	
	public String getID() { 
		return this.imdbID;
	}
	public String getTitle() { 
		return this.Title;
	}
	public double getimdbScore() throws ParseException { 
		if (this.imdbVotes != "N/A" & this.imdbRating != "N/A") {
			try {
			int votes = NumberFormat.getNumberInstance(java.util.Locale.US).parse(this.imdbVotes).intValue();
			int rating = NumberFormat.getNumberInstance(java.util.Locale.US).parse(this.imdbRating).intValue();
			return votes*rating;
			}
		catch (Exception e) {
			return 0;
		}
		}
		else
		return 0;
	}
	public String getType() { 
		return this.Type;
	}
}
