package com.callegasdev.pokemons;

import com.callegasdev.FieldObserver;
import com.callegasdev.FieldType;

public class Charmmander implements FieldObserver {

    private Integer powerAttack = 182;

    public Integer getPowerAttack() {
        return powerAttack;
    }

    private void setPowerAttack(Integer powerAttack) {
        this.powerAttack = powerAttack;
    }

    private void getStatus(){
        System.out.println("Charmmander current attack: " + getPowerAttack());
    }

    @Override
    public void update(FieldType currentField) {
        switch (currentField) {
            case THUNDER:
                setPowerAttack(191);
                System.out.println();
                break;
            case WATER:
                setPowerAttack(111);
                break;
            case FIRE:
                setPowerAttack(200);
                break;
            case WINDY:
                setPowerAttack(163);
                break;
            default:
                break;
        }
        getStatus();
    }
}
