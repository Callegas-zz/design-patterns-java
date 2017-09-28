package com.callegasdev.genji.Skills;

import com.callegasdev.genji.GenjiStrategy;

public class Deflect implements GenjiStrategy {

    private final String type = "counterattack type";
    private Integer damage;
    private final Integer cooldownSeconds = 8;
    private final Double latest = 0.2;

    public Deflect(Integer damage) {
        this.damage = damage;
    }

    @Override
    public void attack() {
        System.out.println("Genji attack -> " + this);
    }

    @Override
    public String toString() {
        return "Deflect{" +
                "type='" + type + '\'' +
                ", damage=" + damage +
                ", cooldownSeconds=" + cooldownSeconds +
                ", latest=" + latest +
                '}';
    }
}
