package com.lazada.exam2.abstraction;

public abstract class Animal {
	// abstract methods
		abstract void move();
		abstract void eat();

		// concrete method
		void label() {
			System.out.println("Animal's data:");
		}
}
