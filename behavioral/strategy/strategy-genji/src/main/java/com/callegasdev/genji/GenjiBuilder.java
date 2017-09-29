package com.callegasdev.genji;

import com.callegasdev.genji.Skills.Deflect;
import com.callegasdev.genji.Skills.Dragonblade;
import com.callegasdev.genji.Skills.SwiftStrike;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GenjiBuilder {

    private Genji genjiBuilded;

    public void execute(String strategyType){
        genjiBuilded = new Genji(strategyBuilder().get(strategyType));
        genjiBuilded.goToFight();
    }

    private Map<String, GenjiStrategy> strategyBuilder() {
        Map<String, GenjiStrategy> strategies = new HashMap<>();

        strategies.put("counterattack", new Deflect(new Random().nextInt()));
        strategies.put("dash", new SwiftStrike());
        strategies.put("ultimate", new Dragonblade());

        return strategies;
    }
}
