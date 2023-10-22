package org.example.attacks.statusAttacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class BatonPass extends StatusMove {
    public BatonPass(){
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.restore();
    }

    @Override
    protected String describe() {
        return "применяет Baton Pass";
    }
}
