package com.teste.MoviesBattle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoviesBattleApplication {

	
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(MoviesBattleApplication.class, args);
		//SpringApplication.run(MoviesBattleApplication.class, args);
		/*
		for(Movie movie : MatchService.fetchMovies()){
			System.out.println(movie.getTitle());
			System.out.println(movie.getimdbScore());
			System.out.println(movie.Poster);
        }*/
		

	}

}
