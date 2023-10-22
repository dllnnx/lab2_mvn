package org.example.attacks.physicalAttacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class SkyAttack extends PhysicalMove {
    public SkyAttack(){
        super(Type.FLYING, 140, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon opp) {
        if (Math.random() <= 0.3){
            Effect.flinch(opp);
        }
    }

    @Override
    protected String describe() {
        return "применяет Sky Attack";
    }
}
