package com.lazada.exam2.abstraction;

public class MainAnimalTest {
	public static void main(String[] args) {
		Animal myBird = new Bird();

		myBird.label();
		myBird.move();
		myBird.eat();
		
		Animal myFish = new Fish();

		myFish.label();
		myFish.move();
		myFish.eat();
	}
}
