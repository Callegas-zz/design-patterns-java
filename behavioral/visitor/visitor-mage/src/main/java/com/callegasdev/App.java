package com.callegasdev;

import com.callegasdev.skills.Skills;

public class App {
    public static void main(String[] args) {
        MageSkills mageSkills = new Skills();
        mageSkills.accept(new MageSkillsDisplayVisitor());
    }
}
