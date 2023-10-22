package org.example.pokemons;

import org.example.attacks.specialAttacks.ThunderShock;
import org.example.attacks.statusAttacks.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Honchkrow extends Pokemon {
    public Honchkrow(String name, int level){
        super(name, level);
        setStats(100, 125, 52, 105, 52, 71);
        setType(Type.DARK, Type.FLYING);
        setMove(new ThunderShock(), new ThunderWave());
    }
}
