package com.callegasdev;

import com.callegasdev.genji.Skills.Deflect;
import com.callegasdev.genji.Skills.Dragonblade;
import com.callegasdev.genji.Skills.SwiftStrike;
import com.callegasdev.genji.Genji;

public class App {

    public static void main(String[] args) {

        Genji genjiDeflect = new Genji(new Deflect(120));
        genjiDeflect.goToFight();

        Genji genjiSwiftStrike = new Genji(new SwiftStrike());
        genjiSwiftStrike.goToFight();

        Genji genjiDragonblade = new Genji(new Dragonblade());
        genjiDragonblade.goToFight();

    }

}
