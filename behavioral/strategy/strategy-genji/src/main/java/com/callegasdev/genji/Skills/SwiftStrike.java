package com.callegasdev.genji.Skills;

import com.callegasdev.genji.GenjiStrategy;

public class SwiftStrike implements GenjiStrategy {

    private final String type = "Damaging movement";
    private final Integer damage = 50;
    private final Integer cooldownSeconds = 8;
    private final Double latest = 0.4;


    @Override
    public void attack() {
        System.out.println("Genji attack -> " + this);
    }

    @Override
    public String toString() {
        return "SwiftStrike{" +
                "type='" + type + '\'' +
                ", damage=" + damage +
                ", cooldownSeconds=" + cooldownSeconds +
                ", latest=" + latest +
                '}';
    }
}
