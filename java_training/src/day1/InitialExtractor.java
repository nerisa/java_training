package day1;

import java.util.Scanner;

/**
 * WAP that computes your initial from your full name and display them.
 * 
 * @author nerisa
 */

public class InitialExtractor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		String name = new String();
		// String initial=new String();
		int indexOfSpace = 0;
		System.out.println("Enter your full name");
		name = userInput.nextLine().trim();
		indexOfSpace = name.indexOf(' ');
		// System.out.println(indexOfSpace);
		System.out.println("Your initial is: ");
		System.out.println(name.substring(0, indexOfSpace));
		userInput.close();
	}

}
