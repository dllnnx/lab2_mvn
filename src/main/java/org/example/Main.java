package org.example;

import org.example.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Moltres("alena", 1);
        Pokemon p2 = new Cranidos("bot", 1);
        Pokemon p3 = new Rampardos("azat", 1);
        Pokemon p4 = new Honchkrow("Maven", 1);
        Pokemon p5 = new Glameow("Java", 1);
        Pokemon p6 = new Purugly("JSF", 1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();
    }
}
