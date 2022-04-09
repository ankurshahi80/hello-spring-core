package com.revature.daos;

import com.revature.models.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class PokemonDaoImpl implements PokemonDao{
    @Override
    public List<Pokemon> getAllPokemon() {
        List<Pokemon> dbPokemon = new ArrayList<>();
        // hardcode records
        dbPokemon.add(new Pokemon(1, "Pikachu", "electric",1500));
        dbPokemon.add(new Pokemon(2, "Abra", "psychic",20));
        dbPokemon.add(new Pokemon(3, "Psyduck", "water",900));
        dbPokemon.add(new Pokemon(4, "Gastly", "ghost",1200));
        dbPokemon.add(new Pokemon(5, "Arceus", "normal",1425));
        dbPokemon.add(new Pokemon(6, "Charmeleon", "fire",2500));
        return dbPokemon;
    }
}
