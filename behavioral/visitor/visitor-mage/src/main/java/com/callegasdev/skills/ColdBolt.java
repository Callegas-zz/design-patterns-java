package com.callegasdev.skills;

import com.callegasdev.MageSkills;
import com.callegasdev.MageSkillsVisitor;

public class ColdBolt implements MageSkills {

    @Override
    public void accept(MageSkillsVisitor mageSkillsVisitor) {
        mageSkillsVisitor.visit(this);
    }

}
