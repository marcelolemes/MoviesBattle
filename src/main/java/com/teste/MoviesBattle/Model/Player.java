package com.teste.MoviesBattle.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PLAYER")
public class Player {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
	public int PlayerCode;
	
	public String PlayerName;
	
	public int PlayerScore;
	public int PlayerMistakes;
	public int PlayerQuizes;
	
	public Player(String playerName) {
		PlayerName = playerName;
		PlayerScore = 0;
		PlayerMistakes = 0;
		PlayerQuizes = 0;
	}
	
	
}
