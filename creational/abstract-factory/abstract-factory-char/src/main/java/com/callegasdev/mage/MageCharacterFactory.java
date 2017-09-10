package com.callegasdev.mage;

import com.callegasdev.CharacterFactory;
import com.callegasdev.Inventory;
import com.callegasdev.Skills;

public class MageCharacterFactory implements CharacterFactory{

    @Override
    public Skills createSkills() {
        return new MageSkills();
    }

    @Override
    public Inventory createInventory() {
        return new MageInventory();
    }
}
