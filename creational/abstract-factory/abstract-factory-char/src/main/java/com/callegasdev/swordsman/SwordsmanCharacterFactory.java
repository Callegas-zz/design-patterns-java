package com.callegasdev.swordsman;

import com.callegasdev.CharacterFactory;
import com.callegasdev.Inventory;
import com.callegasdev.Skills;

public class SwordsmanCharacterFactory implements CharacterFactory {

    @Override
    public Skills createSkills() {
        return new SwordsmanSkills();
    }

    @Override
    public Inventory createInventory() {
        return new SwordsmanInventory();
    }
}
