package org.example.pokemons;

import org.example.attacks.physicalAttacks.Fissure;
import org.example.attacks.physicalAttacks.SkyAttack;
import org.example.attacks.specialAttacks.IceBeam;
import org.example.attacks.statusAttacks.Imprison;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
public class Moltres extends Pokemon {
    public Moltres(String name, int level){
        super(name, level);
        setStats(90, 100, 90, 125, 85, 90);
        setType(Type.FIRE, Type.FLYING);
        setMove(new Imprison(), new SkyAttack(), new IceBeam(), new Fissure());
    }
}
