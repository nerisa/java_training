/**WAP that computes your initial from your full name and display them.
 * 
 */
package day1;

import java.util.Scanner;

/**
 * @author nerisa
 *
 */
public class ComputeInitial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner userInput=new Scanner(System.in);
		String name=new String();
		//String initial=new String();
		int indexOfSpace;
		System.out.println("Enter your full name");
		name=userInput.nextLine().trim();
		indexOfSpace=name.indexOf(' ');
		//System.out.println(indexOfSpace);
		System.out.println("Your initial is: ");
		System.out.println(name.substring(0, indexOfSpace));
		userInput.close();
		}
		

	

}
