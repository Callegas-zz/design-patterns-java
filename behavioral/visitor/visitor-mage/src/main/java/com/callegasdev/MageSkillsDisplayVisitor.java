package com.callegasdev;

import com.callegasdev.skills.ColdBolt;
import com.callegasdev.skills.FireBolt;
import com.callegasdev.skills.Skills;
import com.callegasdev.skills.ThunderStorm;

public class MageSkillsDisplayVisitor implements MageSkillsVisitor {

    @Override
    public void visit(Skills skills) {
        System.out.println("Displaying Skills.");
    }

    @Override
    public void visit(ColdBolt coldBolt) {
        System.out.println("Displaying ColdBolt.");
    }

    @Override
    public void visit(FireBolt fireBolt) {
        System.out.println("Displaying FireBolt.");
    }

    @Override
    public void visit(ThunderStorm thunderStorm) {
        System.out.println("Displaying ThunderStorm.");
    }

}
