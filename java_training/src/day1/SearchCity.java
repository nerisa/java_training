/**WAP which accepts name of cities.
 * Ask user to enter the character sequence to search the city with
 * that sequence.
 * 
 */
package day1;

import java.util.Scanner;

/**
 * @author nerisa
 *
 */
public class SearchCity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] cities;
		cities=new String[10];
		String searchString=new String();
		Scanner userInput=new Scanner(System.in);
		System.out.println("Enter the name of 10 cities");
		for(int i=0;i<10;i++){
			cities[i]=userInput.nextLine().trim();
		}
		System.out.println("Enter the search string");
		searchString=userInput.nextLine();
		for(int i=0;i<10;i++){
			if(cities[i].toLowerCase().contains(searchString.toLowerCase())){
				System.out.println(cities[i]);
			}
		}
		userInput.close();
	}

}
