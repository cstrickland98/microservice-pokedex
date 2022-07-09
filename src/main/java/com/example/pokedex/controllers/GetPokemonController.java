package com.example.pokedex.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
public class GetPokemonController
{
    private final ArrayList<Pokemon> MOCKDATA = new ArrayList<Pokemon>();

    public GetPokemonController()
    {
        this.addMockData();
    }


    @GetMapping("/getPokemon")
    public String getPokemon()
    {
        String result = "";
        for (Pokemon pokemon : this.MOCKDATA)
        {
            result += pokemon + "\n";
        }
        return result;
    }

    private void addMockData()
    {
        this.MOCKDATA.add(new Pokemon(1, "Bulbasaur"));
        this.MOCKDATA.add(new Pokemon(2, "Ivysaur"));
        this.MOCKDATA.add(new Pokemon(3, "Venasaur"));
        this.MOCKDATA.add(new Pokemon(4, "Charmander"));
        this.MOCKDATA.add(new Pokemon(5, "Charmeleon"));
    }
}

class Pokemon
{
    private int id;
    private String name;

    public Pokemon(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "[" + this.id + "] " + this.name;
    }
}

