package org.example.pokemons;

import org.example.attacks.physicalAttacks.PinMissile;
import org.example.attacks.physicalAttacks.ShadowPunch;
import org.example.attacks.specialAttacks.ThunderShock;
import org.example.attacks.statusAttacks.ThunderWave;
import ru.ifmo.se.pokemon.Type;

public class Purugly extends Glameow {
    public Purugly(String name, int level){
        super(name, level + 38);
        setStats(71, 82, 64, 64, 59, 112);
        setType(Type.NORMAL);
        setMove(new ThunderShock(), new ThunderWave(), new PinMissile(), new ShadowPunch());
    }
}
