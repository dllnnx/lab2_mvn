package org.example.attacks.physicalAttacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class PinMissile extends PhysicalMove {
    public PinMissile(){
        super(Type.BUG, 25, 95);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage) {
        double chance = Math.random();
        int counter = 1;
        if (chance <= 0.375){
            damage = 50;
            counter = 2;
        }
        if (chance > 0.375 && chance <= 0.750){
            damage = 75;
            counter = 3;
        }
        if (chance > 0.750 && chance <= 0.875){
            damage = 100;
            counter = 4;
        }
        if (chance > 0.875){
            damage = 125;
            counter = 5;
        }
        while (counter != 0){
            pokemon.setMod(Stat.HP, (int) damage);
            counter --;
        }
    }

    @Override
    protected String describe() {
        return "применяет Pin Missile";
    }
}
