package com.callegasdev;

public class Gun {

    public void shoot(String ammunitionType) {
        AmmunitionFactory ammunitionFactory = new AmmunitionFactory();

        Ammunition ammunition = ammunitionFactory.getAmmunition(ammunitionType);
        ammunition.fire();

    }
}
