
package com.teste.MoviesBattle.Util;

import java.io.BufferedReader;
import java.io.IOException;

public class Json {
    public static String converteJsonEmString(BufferedReader buffereReader) throws IOException {
        String resposta, jsonEmString = "";
        while ((resposta = buffereReader.readLine()) != null) {
            jsonEmString += resposta;
        }
        return jsonEmString;
    }
}