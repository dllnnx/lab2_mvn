package org.example.pokemons;

import org.example.attacks.physicalAttacks.ShadowPunch;
import org.example.attacks.specialAttacks.HydroPump;
import org.example.attacks.statusAttacks.LightScreen;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Cranidos extends Pokemon {
    public Cranidos(String name, int level){
        super(name, level);
        setStats(67, 125, 40, 30, 30, 58);
        setType(Type.ROCK);
        setMove(new LightScreen(), new ShadowPunch(), new HydroPump());
    }
}
