package com.callegasdev;

import java.util.ArrayList;
import java.util.List;

public class Chest {

    private List<Weapon> weaponList;

    public Chest() {
        weaponList = new ArrayList<>();
        weaponList.add(new Weapon(WeaponType.AXE, 10));
        weaponList.add(new Weapon(WeaponType.CAGE, 2));
        weaponList.add(new Weapon(WeaponType.BOW, 7));
        weaponList.add(new Weapon(WeaponType.BOW, 3));
    }


}
