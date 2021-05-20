package com.example.GameOfThrones_Beginning.controller;


import com.google.gson.*;

import java.io.Console;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;





public class GetJsonapi {
    public static JsonObject ResultOfCharacters (String id) throws Exception {
    URL url = new URL("https://anapioficeandfire.com/api/characters/" + id);
    URLConnection request = url.openConnection();
    request.connect();

    //Convert to a JSON object to print data
    JsonParser jp = new JsonParser(); //from gson
    JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
    JsonObject rootobj = root.getAsJsonObject();
    System.out.println(rootobj);
    return rootobj;
    }
}
