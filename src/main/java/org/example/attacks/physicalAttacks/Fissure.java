package org.example.attacks.physicalAttacks;
import ru.ifmo.se.pokemon.*;

public class Fissure extends PhysicalMove{
    public Fissure(){
        super(Type.GROUND, 0, 30);
    }

    int selfLevel, oppLevel;
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        selfLevel = pokemon.getLevel();
    }

    @Override
    protected void applyOppEffects(Pokemon opp) {
        oppLevel = opp.getLevel();
        if (selfLevel >= oppLevel){
            opp.addEffect(new Effect().stat(Stat.HP, 0));
        }
    }


    @Override
    protected String describe() {
        return "применяет Fissure";
    }
}
