package com.sharma.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeService {

    private ChuckNorrisQuotes quotes;

    public JokeService() {
        this.quotes = new ChuckNorrisQuotes();
    }

    public String getJoke(){
        return quotes.getRandomQuote();
    }

}
