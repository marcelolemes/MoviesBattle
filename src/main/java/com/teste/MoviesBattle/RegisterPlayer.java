package com.teste.MoviesBattle;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.teste.MoviesBattle.Model.Player;


// Classe criada para inicializar o cadastro de jogadores


//public class RegisterPlayer  implements ApplicationRunner{
public class RegisterPlayer{
/*	
	
	@Autowired
    private PlayerRepository repository;
		
	public RegisterPlayer() {
		
	}

	public void savePlayer(Player player) {
		
		try {
		repository.save(player);
		}
		catch (Exception e) {
			System.out.println(player.PlayerCode);
			System.out.println(player.PlayerName);
			System.out.println(repository);
			System.out.println(e.getLocalizedMessage());
		}
	    
	    
	}

/*

	@Override
	public void run(ApplicationArguments args) throws Exception {
		ArrayList <Player> listPlayers = new ArrayList<Player>();
		listPlayers.add( new Player("Jackson"));
		listPlayers.add( new Player("Otávio"));
		listPlayers.add( new Player("Cardoso"));
		listPlayers.add( new Player("Jefferson"));
		listPlayers.add( new Player("Maicon"));
		listPlayers.add( new Player("Tarso"));
		System.out.println("Lista ok");
		
		listPlayers.stream().forEach(player -> savePlayer(player));
		System.out.println("Save ok");
			
		
		
				
	}	*/ 
}


