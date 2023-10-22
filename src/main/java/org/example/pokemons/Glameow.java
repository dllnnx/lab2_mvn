package org.example.pokemons;

import org.example.attacks.physicalAttacks.PinMissile;
import org.example.attacks.specialAttacks.ThunderShock;
import org.example.attacks.statusAttacks.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Glameow extends Pokemon {
    public Glameow(String name, int level){
        super(name, level);
        setStats(49, 55, 42, 42, 37, 85);
        setType(Type.NORMAL);
        setMove(new ThunderShock(),new ThunderWave(), new PinMissile());
    }
}
