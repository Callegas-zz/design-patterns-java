package com.callegasdev.genji;

import com.callegasdev.genji.Skills.Deflect;
import com.callegasdev.genji.Skills.Dragonblade;
import com.callegasdev.genji.Skills.SwiftStrike;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GenjiFactory {

    private Genji genji;

    public GenjiFactory(String strategyType) {
        Map<String, GenjiStrategy> strategies = new HashMap<>();

        strategies.put("counterattack", new Deflect(new Random().nextInt(150)));
        strategies.put("dash", new SwiftStrike());
        strategies.put("ultimate", new Dragonblade());

        this.genji = new Genji(strategies.get(strategyType));
    }

    public void execute(){
        this.genji.goToFight();
    }

}
