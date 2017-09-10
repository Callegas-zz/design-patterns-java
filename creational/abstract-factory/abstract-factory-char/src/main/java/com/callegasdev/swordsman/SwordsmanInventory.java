package com.callegasdev.swordsman;

import com.callegasdev.Inventory;

public class SwordsmanInventory implements Inventory {

    static final String DESCRIPTION = "{Katana+10; Katana+09; LHK Hat+3; Coat Armor+09}";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
