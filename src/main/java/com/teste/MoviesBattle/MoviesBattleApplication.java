package com.teste.MoviesBattle;

import java.text.DecimalFormat;
import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.teste.MoviesBattle.Model.Movie;

@SpringBootApplication
public class MoviesBattleApplication {

	
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(MoviesBattleApplication.class, args);
		
		DecimalFormat df = new DecimalFormat("########");
		Random random = new Random();
		
		
		
		for (int i = 0; i < 2; i++) {
			String tt = "tt";
			tt+=df.format(random.nextInt(9916856));
			try { 
			Movie movie = MovieService.searchMovie(tt);
			System.out.println(movie.getTitle());
			System.out.println(movie.getimdbScore());
			System.out.println(movie.Poster);
			}
			catch (Exception e) {
				i --;
				//System.out.println(e.getMessage());
			}
			
			}
			

	}

}
