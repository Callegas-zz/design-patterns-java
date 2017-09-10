package com.callegasdev.ammunitiontypes;

import com.callegasdev.Ammunition;

public class Laser implements Ammunition {

    @Override
    public void fire() {
        System.out.println("~~LASER SHOOT");
    }
}
