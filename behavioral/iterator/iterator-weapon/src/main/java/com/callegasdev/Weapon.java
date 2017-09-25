package com.callegasdev;

public class Weapon {
    private WeaponType type;
    private Integer damage;

    public Weapon(WeaponType type, Integer damage) {
        this.type = type;
        this.damage = damage;
    }

    public WeaponType getType() {
        return type;
    }

    public void setType(WeaponType type) {
        this.type = type;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "type=" + type +
                ", damage=" + damage +
                '}';
    }
}
