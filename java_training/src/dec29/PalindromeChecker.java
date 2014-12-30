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
	/** checks the integer palindrome
	 * @param number user entered number 
	 */
	static int number = 0;

	public static boolean validChecker() {
		/** checks whether the entered number is a 5 digit integer
		 * @param inputValid variable that checks the validity
		 */
		boolean inputValid = false;
		if (Integer.toString(Math.abs(number)).length() == 5) {
			inputValid = true;
		}
		return inputValid;

	}

	public static void main(String[] args) {
		/**
		 * @param is5digit stores whether the user input is 5 digit
		 * @param notInteger stores if the user entered invalid nos.
		 * @param initialNumber stores the user entered integer converted to string
		 * @param reverseNumber stores the reversed integer in string format 
		 */
		boolean is5digit = false;
		boolean notInteger = false;
		String initialNumber = "";
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
		initialNumber = Integer.toString(Math.abs(number));
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
