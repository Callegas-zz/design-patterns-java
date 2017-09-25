package com.callegasdev.pokemons;

import com.callegasdev.FieldObserver;
import com.callegasdev.FieldType;

public class Squartle implements FieldObserver {

    private Integer powerAttack = 168;

    public Integer getPowerAttack() {
        return powerAttack;
    }

    private void setPowerAttack(Integer powerAttack) {
        this.powerAttack = powerAttack;
    }

    private void getStatus(){
        System.out.println("Squartle current attack: " + getPowerAttack());
    }

    @Override
    public void update(FieldType currentField) {
        switch (currentField) {
            case THUNDER:
                setPowerAttack(200);
                break;
            case WATER:
                setPowerAttack(180);
                break;
            case FIRE:
                setPowerAttack(218);
                break;
            case WINDY:
                setPowerAttack(155);
                break;
            default:
                break;
        }
        getStatus();
    }
}
