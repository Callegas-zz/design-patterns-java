package com.callegasdev.genji;

public class Genji {

    private GenjiStrategy strategy;

    public Genji(GenjiStrategy strategy) {
        this.strategy = strategy;
    }

    public void choiceStrategy(GenjiStrategy strategy) {
        this.strategy = strategy;
    }

    public void goToFight() {
        strategy.attack();
    }
}
