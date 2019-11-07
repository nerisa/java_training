package day1;

import java.util.Scanner;

/**
 * Create a class MutableImmutableDemo. Inside that class create object greeting
 * of String and another object welcome of StringBuilder type. Try to modify
 * both objects by concatenating substring as suffix
 * 
 * @author nerisa
 */

public class MutableImmutableDemo {

	public static void main(String[] args) {
		String greeting = "Hi ";
		String name = new String();
		StringBuilder welcome = new StringBuilder();
		welcome.append("Welcome ");
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter your name");
		name = userInput.next();
		greeting.concat(name);
		welcome.append(name);
		System.out.println(greeting);
		System.out.println(welcome);
		userInput.close();

	}

}
