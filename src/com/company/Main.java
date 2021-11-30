package com.company;

public class Main {

	public static void main(String[] args) {
		Boos boos = new Boos();
		boos.setHeals(500);
		boos.setDamage(50);
		boos.setWeapon(new Weapon("cold", "mech"));
		System.out.println(boos.getHeals() + " " + boos.getDamage() + " " +
				boos.getWeapon().getTypeWeapon() + " " + boos.getWeapon().getNameWeapon());

		System.out.println(boos.printInfo());

		Skeleton skeleton = new Skeleton();
		skeleton.setHeals(340);
		skeleton.setDamage(70);
		skeleton.setNumberOfArrows(20);
		System.out.println("Скелет:" + skeleton.printInfo());


		Skeleton skeleton1 = new Skeleton();
		skeleton1.setHeals(200);
		skeleton1.setDamage(30);
		skeleton1.setNumberOfArrows(7);
		System.out.println("Скелет:" + skeleton1.printInfo());
	}

}