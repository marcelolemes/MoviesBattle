package com.teste.MoviesBattle;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.teste.MoviesBattle.Model.Movie;

@RestController
@RequestMapping("/match")
public class MatchController {
	/*
	 * @Autowired private MatchService matchService;
	 */
	public List<Movie> movies;

	@GetMapping
	public List<String> Get() throws Exception {
		movies = MatchService.fetchMovies();
		List<String> posters = new ArrayList<String>();
		movies.forEach(n -> posters.add(n.Poster));
		System.out.println(posters);
		return posters;
	}

	@PostMapping
	@ResponseBody
	public String Result(@RequestBody String choice) throws Exception {
		choice = choice.substring(0, 1);
		int value = Integer.parseInt(choice);
		String result;
		if (MatchResult(movies, value)) {
			result ="Você acertou!";
			System.out.println(result);
			return result;
		} else {
			result ="Você errou!";
			System.out.println(result);
			return result ;
			}
		
	}

	public Boolean MatchResult(List<Movie> list, int i) throws ParseException {
		if (i > 0)
			i--;
		switch (i) {
		case 1: 
			if (list.get(i).getimdbScore() >= list.get(i - 1).getimdbScore()) {
				return true;
			} else {
				return false;
			}
		case 0: 
			if (list.get(i).getimdbScore() >= list.get(i + 1).getimdbScore()) {
				return true;
			} else {
				return false;
			}
	
		}
		return false;
		

	}

}
