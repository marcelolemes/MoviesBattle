package com.teste.MoviesBattle;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.teste.MoviesBattle.Model.Player;
import com.teste.MoviesBattle.Model.PlayerScore;



//@Entity
public class Match{

	@Id
	protected int MatchId;
	//PlayerScore playerScore;
	Player player;
	//List<Movie> matchMovies;
	
	public Match(Player player) {
		this.player = player;
	}
	
	
}
