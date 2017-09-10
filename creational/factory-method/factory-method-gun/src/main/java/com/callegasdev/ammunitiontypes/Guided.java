package com.callegasdev.ammunitiontypes;

import com.callegasdev.Ammunition;

public class Guided implements Ammunition {

    @Override
    public void fire() {
        System.out.println("~~GUIDED SHOOT");
    }
}
