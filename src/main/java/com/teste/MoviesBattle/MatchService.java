package com.teste.MoviesBattle;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.teste.MoviesBattle.Model.Movie;

@Service
public class MatchService {

	public static List<Movie> fetchMovies() throws Exception {

		ArrayList<Movie> movies = new ArrayList<Movie>();

		for (int i = 0; i < 2; i++) {
			Movie movie = MovieService.searchMovie(FormatIdIMDB(9999));
			if (movie.getType().equals("movie"))   {
				if (movie.getimdbScore()==0 | movie.Poster.equals("N/A"))   {
					i--;
				} else {
					
					movies.add(movie);
				} 
			} else
				i--;
			
				

		}
		return movies;
	}

	public static String FormatIdIMDB(int limit) {
		Random random = new Random();
		DecimalFormat df = new DecimalFormat("0000000");
		String tt = "tt";
		tt += df.format(random.nextInt(limit));
		return tt;

	}
}
