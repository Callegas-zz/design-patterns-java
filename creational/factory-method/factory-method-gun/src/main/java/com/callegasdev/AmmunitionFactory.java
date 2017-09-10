package com.callegasdev;

import com.callegasdev.ammunitiontypes.Guided;
import com.callegasdev.ammunitiontypes.Laser;
import com.callegasdev.ammunitiontypes.Piercing;

public class AmmunitionFactory {

    public Ammunition getAmmunition(String ammunitionType) {

        switch (ammunitionType) {
            case "guided":
                return new Guided();

            case "laser":
                return new Laser();

            case "piercing":
                return new Piercing();

            default:
                return null;
        }

    }
}
