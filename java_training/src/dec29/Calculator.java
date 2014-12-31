/**Write a program using switch statement to develop a simple calculator for +, -, *, /, and % operators.
 * 
 */
package dec29;

import java.util.Scanner;

/**
 * performs simple calculations of two user entered numbers
 * 
 * @author nerisa
 * @param firstNumber
 *            first operand of the operations
 * @param secondNumber
 *            second operand of the operations
 */
public class Calculator {
	static Scanner userInput = new Scanner(System.in);
	static double firstNumber = 0;
	static double secondNumber = 0;

	public static void main(String[] args) {
		Scanner choice = new Scanner(System.in);
		String userChoice = "";
		System.out.println("1. Add\n" + "2. Subtract\n" + "3. Multiply\n"
				+ "4. Divide\n" + "5. Remainder");
		System.out.println("Enter the required operation:");
		try {
			userChoice = choice.nextLine();
			switch (userChoice) {
			case "1":
				add();
				break;
			case "2":
				subtract();
				break;
			case "3":
				multiply();
				break;
			case "4":
				divide();
				break;
			case "5":
				modulus();
				break;
			default:
				System.out.println("Invalid choice");
				break;

			}
		} finally {
			choice.close();
		}

	}

	/**
	 * Adds the user entered variables and displays the result
	 * 
	 * @param result
	 *            stores the result of addition
	 */
	public static void add() {

		double result = 0.0;
		System.out.println("Enter the two nos to be added");
		try {
			firstNumber = Double.parseDouble(userInput.nextLine());
			secondNumber = Double.parseDouble(userInput.nextLine());
		} catch (NumberFormatException e) {
			System.err.println("Expcetion while formatting number: "
					+ e.getMessage());
		}
		result = firstNumber + secondNumber;
		System.out.printf("Result= %f", result);
	}

	/**
	 * subtracts the user entered variables and prints the result
	 * 
	 * @param result
	 *            stores the result of subtraction
	 */
	public static void subtract() {
		double result = 0.0;
		try {
			System.out.println("Enter the minuend");
			firstNumber = Double.parseDouble(userInput.nextLine());
			System.out.println("Enter the subtrahend");
			secondNumber = Double.parseDouble(userInput.nextLine());
		} catch (NumberFormatException e) {
			System.err.println("Expcetion while formatting number: "
					+ e.getMessage());
		}
		result = firstNumber - secondNumber;
		System.out.printf("Result= %f", result);
	}

	/**
	 * Multiplies the user entered variables and displays the result
	 * 
	 * @param result
	 *            stores the result of multiplication
	 */
	public static void multiply() {
		double result = 0.0;
		System.out.println("Enter the two nos to be multiplied");
		try {
			firstNumber = Double.parseDouble(userInput.nextLine());
			secondNumber = Double.parseDouble(userInput.nextLine());
		} catch (NumberFormatException e) {
			System.err.println("Expcetion while formatting number: "
					+ e.getMessage());
		}
		result = firstNumber * secondNumber;
		System.out.printf("Result= %f", result);
	}

	/**
	 * computes dividend/divisor and prints the result
	 * 
	 * @param result
	 *            stores the result of division
	 */
	public static void divide() {
		double result = 0.0;
		do {
			try {
				System.out.println("\nEnter the dividend");
				firstNumber = Double.parseDouble(userInput.nextLine());
				System.out.println("Enter the divisor");
				secondNumber = Double.parseDouble(userInput.nextLine());
			} catch (NumberFormatException e) {
				System.err.println("Expcetion while formatting number: "
						+ e.getMessage());
			}
			if (secondNumber == 0) {
				System.out.println("Divisor cannot be 0");
			}
		} while (secondNumber == 0);
		result = firstNumber / secondNumber;
		System.out.printf("Result= %f", result);

	}

	/**
	 * computes the remainder of dividend/divisor and prints the result
	 * 
	 * @param result
	 *            stores the remainder
	 */
	public static void modulus() {
		double result = 0.0;
		do {
			try {
				System.out.println("Enter the dividend");
				firstNumber = Double.parseDouble(userInput.nextLine());
				System.out.println("Enter the divisor");
				secondNumber = Double.parseDouble(userInput.nextLine());
			} catch (NumberFormatException e) {
				System.err.println("Expcetion while formatting number: "
						+ e.getMessage());
			}
			if (secondNumber == 0) {
				System.out.println("Divisor cannot be 0");
			}
		} while (secondNumber == 0);
		result = firstNumber % secondNumber;
		System.out.printf("Result= %f", result);
	}
}
