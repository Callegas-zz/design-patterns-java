package com.callegasdev.mage;

import com.callegasdev.Skills;

public class MageSkills implements Skills {

    static final String DESCRIPTION = "{Fire Bolt; Fire Wall; Cold Bold; Frost Driver; Jupter Thunder}";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
