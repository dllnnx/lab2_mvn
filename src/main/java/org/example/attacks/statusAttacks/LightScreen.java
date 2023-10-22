package org.example.attacks.statusAttacks;

import ru.ifmo.se.pokemon.*;

public class LightScreen extends StatusMove {
    public LightScreen(){
        super(Type.PSYCHIC, 0,0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect e = new Effect().stat(Stat.SPECIAL_ATTACK,
                (int) (pokemon.getStat(Stat.SPECIAL_ATTACK) * 0.5)).turns(5);
        pokemon.addEffect(e);
    }

    @Override
    protected String describe() {
        return "применяет Light Screen";
    }
}
