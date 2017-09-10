package com.callegasdev.mage;

import com.callegasdev.Inventory;

public class MageInventory implements Inventory {

    static final String DESCRIPTION = "{Imperial cage+9; Bless Shield+4; Poop Hat+7; Ghost Armor+8}";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
