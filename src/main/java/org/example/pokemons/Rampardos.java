package org.example.pokemons;

import org.example.attacks.physicalAttacks.ShadowPunch;
import org.example.attacks.specialAttacks.HydroPump;
import org.example.attacks.statusAttacks.BatonPass;
import org.example.attacks.statusAttacks.LightScreen;
import ru.ifmo.se.pokemon.Type;

public class Rampardos extends Cranidos {
    public Rampardos(String name, int level){
        super(name, level + 30);
        setStats(97, 165, 60, 65, 50, 58);
        setType(Type.ROCK);
        setMove(new LightScreen(), new ShadowPunch(), new HydroPump(), new BatonPass());
    }
}
