package com.company;

public class Boos extends GameEntity {
   private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public String printInfo(){
        return super.getDamage() +  " Damage" + " Health " + getHeals();
    }
}
