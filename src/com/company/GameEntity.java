package com.company;

public class GameEntity  {
    private int Heals;
    private int Damage;
    private String superpower;

    public int getHeals() {
        return Heals;
    }

    public void setHeals(int heals) {
        Heals = heals;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public String getSuperpower() {
        return superpower;
    }

    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }
}
