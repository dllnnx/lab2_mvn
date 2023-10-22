package org.example.attacks.statusAttacks;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Imprison extends StatusMove {
    public Imprison(){
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected String describe() {
        return "применяет Imprison";
    }
}
