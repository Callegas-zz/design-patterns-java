package com.callegasdev;

import com.callegasdev.mage.MageCharacterFactory;
import com.callegasdev.swordsman.SwordsmanCharacterFactory;

public class App {

    private Inventory inventory;
    private Skills skills;

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(final Inventory inventory) {
        this.inventory = inventory;
    }

    public Skills getSkills() {
        return skills;
    }

    public void setSkills(final Skills skills) {
        this.skills = skills;
    }

    public void createCharacter(final CharacterFactory factory) {
        setInventory(factory.createInventory());
        setSkills(factory.createSkills());
    }

    public static void main(String[] args) {
        App app = new App();

        System.out.println("++MAGE++");
        app.createCharacter(new MageCharacterFactory());
        System.out.println("Inventory: " + app.getInventory().getDescription());
        System.out.println("Skills: " + app.getSkills().getDescription());

        System.out.println("++SWORDSMAN++");
        app.createCharacter(new SwordsmanCharacterFactory());
        System.out.println("Inventory: " + app.getInventory().getDescription());
        System.out.println("Skills: " + app.getSkills().getDescription());


    }


}
