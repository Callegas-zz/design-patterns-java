package com.callegasdev.genji.Skills;

import com.callegasdev.genji.GenjiStrategy;

public class Dragonblade implements GenjiStrategy {

    private final String type = "Damaging movement";
    private final Integer damage = 120; //per hit
    private final Double latest = 6.0;


    @Override
    public void attack() {
        System.out.println("Genji attack -> " + this);
    }

    @Override
    public String toString() {
        return "Dragonblade{" +
                "type='" + type + '\'' +
                ", damage=" + damage +
                ", latest=" + latest +
                '}';
    }
}
