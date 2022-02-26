package com.teste.MoviesBattle;

import com.teste.MoviesBattle.Model.Player;

import java.util.List;

import com.teste.MoviesBattle.Model.Movie;
import com.teste.MoviesBattle.Model.PlayerScore;




public class Match{

	
	protected int MatchId;
	PlayerScore playerScore;
	Player player;
	List<Movie> matchMovies;
	
	public Match(Player player) {
		this.player = player;
	}
	
	
}
