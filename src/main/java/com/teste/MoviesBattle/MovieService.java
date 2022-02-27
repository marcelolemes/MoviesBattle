package com.teste.MoviesBattle;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;
import com.teste.MoviesBattle.Model.Movie;

public class MovieService extends Movie {
	static String webService = "http://www.omdbapi.com/?";
	static String apikey= "431aca1a";
	static int codigoSucesso = 200;
	
	public static Movie searchMovie(String movieCode) throws Exception {
		String urlParaChamada = webService+ "apikey="+apikey+"&i=" + movieCode;
		//System.out.println(urlParaChamada);
		//String urlParaChamada = webService+ "apikey="+apikey+"&t=" + cod;

		try {
			URL url = new URL(urlParaChamada);
			HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

			if (conexao.getResponseCode() != codigoSucesso) {
				System.out.println(conexao.getResponseCode());
				throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());
			}

			BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream())));
			//String json = Json.converteJsonEmString(resposta);
			Gson gson = new Gson(); // conversor
			Movie movie = gson.fromJson(resposta, Movie.class);

			return movie;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(urlParaChamada);
			throw new Exception("ERRO: " + e);
			
		}
		
		
	}
}
