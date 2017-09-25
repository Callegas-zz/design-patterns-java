package com.callegasdev.skills;

import com.callegasdev.MageSkills;
import com.callegasdev.MageSkillsVisitor;

public class Skills implements MageSkills {

    MageSkills[] skills;

    public Skills(){
        skills = new MageSkills[] {new ColdBolt(), new FireBolt(), new ThunderStorm()};
    }

    @Override
    public void accept(MageSkillsVisitor mageSkillsVisitor) {
        for (int i = 0; i < skills.length; i++) {
            skills[i].accept(mageSkillsVisitor);
        }
        mageSkillsVisitor.visit(this);
    }

}
