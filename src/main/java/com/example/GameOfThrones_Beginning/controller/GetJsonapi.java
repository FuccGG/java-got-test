package com.example.GameOfThrones_Beginning.controller;


import com.google.gson.*;

import org.apache.http.client.fluent.Content;
import org.apache.http.client.fluent.Request;

import java.io.Console;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.http.HttpResponse;


public class GetJsonapi {

    static String name;

    public static JsonElement GetJason(String id) throws IOException {
        String path ="https://anapioficeandfire.com/api/characters/" + id;
        Content getResult = Request.Get(path).execute().returnContent();
        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) getResult.asStream()));
        System.out.println(root);
        return root;
    }
}

