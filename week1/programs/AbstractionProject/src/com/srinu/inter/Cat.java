package com.srinu.inter;

public class Cat implements Animal{

	@Override
	public void makeSound() {
		System.out.println("Meow");
	}
	
	public static void main(String[] args) {
		Cat c = new Cat();
		c.makeSound();
	}

}
