package org.example;

import org.example.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Moltres("poke1", 1);
        Pokemon p2 = new Cranidos("poke2", 1);
        Pokemon p3 = new Rampardos("poke2", 1);
        Pokemon p4 = new Honchkrow("foe1", 1);
        Pokemon p5 = new Glameow("foe2", 1);
        Pokemon p6 = new Purugly("foe3", 1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();
    }
}
