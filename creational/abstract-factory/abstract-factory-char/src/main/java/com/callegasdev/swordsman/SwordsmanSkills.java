package com.callegasdev.swordsman;

import com.callegasdev.Skills;

public class SwordsmanSkills implements Skills {

    static final String DESCRIPTION = "{HP Recovery; One-Handed Mastery; Two-Handed Mastery; Fire Sword; Flash}";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
