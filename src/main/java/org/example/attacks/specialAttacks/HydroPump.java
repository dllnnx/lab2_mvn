package org.example.attacks.specialAttacks;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class HydroPump extends SpecialMove {
    public HydroPump(){
        super(Type.WATER, 110, 80);
    }

    @Override
    protected String describe() {
        return "применяет Hydro Pump";
    }
}
