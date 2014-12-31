package dec29;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Write a program using switch statement to develop a simple calculator for +,
 * -, *, /, and % operators.
 * 
 * @author nerisa
 * 
 */

public class Calculator {
	static Scanner userInput = new Scanner(System.in);

	/**
	 * Gets the user input for the operands and checks its validity
	 * 
	 * @return the user input operand
	 */
	private static double getUserInput() {
		double enteredNumber = 0;
		boolean isCorrect = false;
		do {
			try {
				isCorrect = true;
				enteredNumber = userInput.nextDouble();
			} catch (InputMismatchException e) {
				System.err.println("Expcetion while formatting number: "
						+ e.getMessage() + "\n Enter again");
				isCorrect = false;
			}
		} while (!isCorrect);
		return enteredNumber;
	}

	public static void main(String[] args) {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		Scanner choice = new Scanner(System.in);
		String userChoice = "";
		try {
			System.out.println("Enter the first operand");
			firstNumber = getUserInput();
			System.out.println("Enter the required operation:");
			System.out.println("1. Add\n" + "2. Subtract\n" + "3. Multiply\n"
					+ "4. Divide\n" + "5. Remainder");
			userChoice = choice.nextLine();
			System.out.println("Enter the second operand");
			secondNumber = getUserInput();
			switch (userChoice) {
			case "1":
				result = add(firstNumber, secondNumber);
				break;
			case "2":
				result = subtract(firstNumber, secondNumber);
				break;
			case "3":
				result = multiply(firstNumber, secondNumber);
				break;
			case "4":
				result = divide(firstNumber, secondNumber);
				break;
			case "5":
				result = modulus(firstNumber, secondNumber);
				break;
			default:
				System.out.println("Invalid choice");
				break;

			}
		} finally {
			userInput.close();
			choice.close();
		}
		System.out.println("Result=" + result);

	}

	/**
	 * Adds the user entered variables
	 * 
	 * @param firstOperand
	 *            first operand
	 * @param secondOperand
	 *            second operand
	 * @return the result of addition
	 */
	public static double add(double firstOperand, double secondOperand) {
		return (firstOperand + secondOperand);
	}

	/**
	 * subtracts the user entered variables and prints the result
	 * 
	 * @param firstOperand
	 *            minuend
	 * @param secondOperand
	 *            subtrahend
	 * @return the difference of operands
	 * 
	 */
	public static double subtract(double firstOperand, double secondOperand) {
		return (firstOperand - secondOperand);
	}

	/**
	 * Multiplies the user entered variables
	 * 
	 * @param firstOperand
	 *            multiplicand
	 * @param secondOperand
	 *            multiplier
	 * @return the multiplication of operands
	 */
	public static double multiply(double firstOperand, double secondOperand) {
		return (firstOperand * secondOperand);
	}

	/**
	 * computes dividend/divisor
	 * 
	 * @param firstOperand
	 *            dividend
	 * @param secondOperand
	 *            divisor
	 * @return the quotient
	 */
	public static double divide(double firstOperand, double secondOperand) {
		do {
			if (secondOperand == 0) {
				System.out.println("Divisor cannot be 0. Enter again");
				secondOperand = getUserInput();
			}
		} while (secondOperand == 0);
		return (firstOperand / secondOperand);
	}

	/**
	 * computes the remainder of dividend/divisor
	 * 
	 * @param firstOperand
	 *            dividend
	 * @param secondOperand
	 *            divisor
	 * @return the quotient
	 */
	public static double modulus(double firstOperand, double secondOperand) {
		do {
			if (secondOperand == 0) {
				System.out.println("Divisor cannot be 0. Enter again");
				secondOperand = getUserInput();
			}
		} while (secondOperand == 0);
		return (firstOperand % secondOperand);
	}
}
