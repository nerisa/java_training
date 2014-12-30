/**A palindrome is a sequence of characters that reads the same backward as forward. 
 * For example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554 and 11611. 
 * Write an application that reads in a five-digit integer and determines whether it is a palindrome. 
 * If the number is not five digits long, display an error message and allow the user to enter a new value.
 * 
 */
package dec29;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author nerisa
 * 
 */
public class PalindromeChecker {
	static int number = 0;

	public static boolean validChecker() {
		boolean inputValid = false;
		if (Integer.toString(number).length() == 5) {
			inputValid = true;
		}
		return inputValid;

	}

	public static void main(String[] args) {
		boolean is5digit = false, notInteger = false;
		String initialNumber;
		String reverseNumber = "";
		Scanner userInput = new Scanner(System.in);
		try {
			do {
				do {
					notInteger=false;
					System.out.println("Enter a five digit integer");
					try {
						number = userInput.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("Please enter an integer");
						userInput.nextLine();
						notInteger = true;
					}
				} while (notInteger);
				is5digit = validChecker();
			} while (!is5digit);
		} finally {
			userInput.close();
		}
		initialNumber = Integer.toString(number);
		// System.out.println(initialNumber);
		for (int i = initialNumber.length() - 1; i >= 0; i--) {
			reverseNumber = reverseNumber + initialNumber.charAt(i);
		}
		// System.out.println(reverseNumber);
		if (initialNumber.equals(reverseNumber)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}

}
