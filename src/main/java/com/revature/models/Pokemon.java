package com.revature.models;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
//@Data combines @Getter, @Setter and @ToString
@EqualsAndHashCode
public class Pokemon {
    private int id;
    private String pokemonName;
    private String pokeType;
    private int attackPower;

    public Pokemon(String pokemonName, String pokeType, int attackPower) {
        this.pokemonName = pokemonName;
        this.pokeType = pokeType;
        this.attackPower = attackPower;
    }
}
