package com.callegasdev.ammunitiontypes;

import com.callegasdev.Ammunition;

public class Piercing implements Ammunition {

    @Override
    public void fire() {
        System.out.println("~~PIERCING SHOOT");
    }
}
