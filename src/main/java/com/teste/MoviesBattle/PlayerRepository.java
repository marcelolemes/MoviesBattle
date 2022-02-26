package com.teste.MoviesBattle;
import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.MoviesBattle.Model.Player;
public interface PlayerRepository extends JpaRepository<Player, Long>{

}

