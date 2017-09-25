package com.callegasdev;

import com.callegasdev.skills.ColdBolt;
import com.callegasdev.skills.FireBolt;
import com.callegasdev.skills.Skills;
import com.callegasdev.skills.ThunderStorm;

public interface MageSkillsVisitor {

    public void visit(Skills skills);
    public void visit(ColdBolt coldBolt);
    public void visit(FireBolt fireBolt);
    public void visit(ThunderStorm thunderStorm);
}
