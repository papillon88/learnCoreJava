package com.test4;

public class Elephant extends Animal {

	@Override
	public void makeSound() {
		System.out.println("Elephant : I flip...");
	}

	@Override
	public void foodItems() {
		System.out.println("Elephant : I eat fruits and vegetables/leaves");
	}
	
	public void splBehavior(){
		System.out.println("Elephant : I have trunk which other animal dont have....");
	}
	

}
