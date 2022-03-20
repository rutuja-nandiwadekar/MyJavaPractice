package com.polymorphism;

class Animal {

	protected String name;

	public Animal(String name) {
		this.name = name;
	}

	protected void displayInfo() {
		System.out.println("Animal name" + name);
	}

	public void show() {
		System.out.println("inside show");
	}
}

class Dog extends Animal {
	int legs;

	public Dog(String name, int legs) {
		super(name);
		this.legs = legs;
	}

	public void displayInfo() {
		System.out.println("My Name is " + name + "\nLegs " + legs);
	}
}

public class methodOverriding {
	public static void main(String... args) {
		Dog d1 = new Dog("Sheru", 4);
		d1.displayInfo();
		System.out.println("Name " + d1.name);
	}
}
