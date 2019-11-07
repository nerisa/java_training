package day1;

import java.util.Scanner;

/**
 * WAP which accepts name of cities. Ask user to enter the character sequence to
 * search the city with that sequence.
 * 
 * @author nerisa
 */
public class SearchCity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] cities = new String[10];
		boolean found = false;
		String searchString;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the name of 10 cities");
		for (int i = 0; i < 10; i++) {
			cities[i] = userInput.nextLine().trim();
		}
		System.out.println("Enter the search string");
		searchString = userInput.nextLine();
		for (int i = 0; i < 10; i++) {
			if (cities[i].toLowerCase().contains(searchString.toLowerCase())) {
				System.out.printf("Found: %s", cities[i]);
				found = true;
			}
		}
		if (!found) {
			System.out.printf("No such cities with the search string %s",
					searchString);
		}
		userInput.close();
	}

}
