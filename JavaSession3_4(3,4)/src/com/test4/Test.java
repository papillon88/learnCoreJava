package com.test4;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Animal obj = new Animal();
		
		Lion l = new Lion();
		l.foodItems();
		l.makeSound();
		l.WhereAmI();
		
		System.out.println("################\n");
		
		Ox o = new Ox();
		o.foodItems();
		o.makeSound();
		o.WhereAmI();
		
		System.out.println("################\n");
		
		Elephant e = new Elephant();
		e.foodItems();
		e.makeSound();
		e.WhereAmI();
		e.splBehavior();
		
		System.out.println("################\n");
		
		Animal e1 = new Elephant();  // up casting
		e1.foodItems();
		e1.makeSound();
		e1.WhereAmI();
		//e1.splBehavior();
		((Elephant)e1).splBehavior();  // down casting
		
		System.out.println("################\n");
		
	}

}
