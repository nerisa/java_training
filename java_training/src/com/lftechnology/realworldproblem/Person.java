package com.lftechnology.realworldproblem;

/**
 * This class acts as a super class for Male and Female class
 * 
 * @author Nerisa Chitrakar nerisachitrakar@lftechnology.com
 * 
 */
public abstract class Person {
	protected String name;

	public Person() {

	}

	public Person(String name) {
		this.name = name;
	}

	/**
	 * This function should simulate the act of wearing clothes.
	 * 
	 * @author Nerisa Chitrakar nerisachitrakar@lftechnology.com
	 */
	abstract void wearClothes();

	/**
	 * This function should simulate the act of putting on shoes.
	 * 
	 * @author Nerisa Chitrakar nerisachitrakar@lftechnology.com
	 * 
	 */
	abstract void putOnShoes();

	public void gotoMovie() {
		wearClothes();
		putOnShoes();
	}
}
