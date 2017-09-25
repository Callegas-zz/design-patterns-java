package com.callegasdev.pokemons;

import com.callegasdev.FieldObserver;
import com.callegasdev.FieldType;

public class Pikachu implements FieldObserver {

    private Integer powerAttack = 190;

    public Integer getPowerAttack() {
        return powerAttack;
    }

    private void setPowerAttack(Integer powerAttack) {
        this.powerAttack = powerAttack;
    }

    private void getStatus(){
        System.out.println("Pikachu current attack: " + getPowerAttack());
    }

    @Override
    public void update(FieldType currentField) {
        switch (currentField) {
            case THUNDER:
                setPowerAttack(192);
                break;
            case WATER:
                setPowerAttack(270);
                break;
            case FIRE:
                setPowerAttack(180);
                break;
            case WINDY:
                setPowerAttack(152);
                break;
            default:
                break;
        }
        getStatus();
    }
}
