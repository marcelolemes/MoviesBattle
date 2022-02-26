package com.teste.MoviesBattle.Model;

public class PlayerScore extends Player {

	public PlayerScore(String playerName) {
		super(playerName);
		// TODO Auto-generated constructor stub
	}
	public void AddPoint() {
		PlayerScore ++;
	}
	public void AddMistake() {
		PlayerMistakes ++;
	}
	public void AddQuiz() {
		PlayerQuizes ++;
	}
	public double getScore() {
		if (PlayerQuizes > 0){
			double Percent = (PlayerScore/PlayerQuizes)*100;
			return PlayerQuizes * Percent;
		}
		else {
			return 0;
		}
		
	}
}
