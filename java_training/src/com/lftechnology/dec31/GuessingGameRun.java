package com.lftechnology.dec31;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Guessing a number game application: User will select the guessing value from
 * the keyboard and application will generate a random no between 1 and 100.
 * Checks if the guess value matched with random no. or not, if matched shows
 * the guessing value, random value and the no. of attempts.
 * 
 * @author nerisa
 * 
 */
public class GuessingGameRun {
	public static void main(String[] args) {
		GuessingGame game = new GuessingGame();
		game.play();
	}
}

class GuessingGame {
	private int userEnteredNumber = 0;
	private int randomInteger = 0;

	/**
	 * Generates a random number between 1 and 100
	 * 
	 */
	private void generateRandomInteger() {
		Random random = new Random();
		do {
			randomInteger = random.nextInt(100);
		} while (randomInteger < 2);
	}

	/**
	 * Gets the user's guess and checks its validity
	 */
	private void getInput() {
		Scanner userInput = new Scanner(System.in);
		boolean isInteger = false;
		do {
			System.out.println("Enter your guess between 0 and 100");
			do {
				try {
					isInteger = true;
					userEnteredNumber = userInput.nextInt();
				} catch (InputMismatchException e) {
					System.err.println("Error in input" + e.getMessage()
							+ "\nEnter an Integer");
					userInput.nextLine();
					isInteger = false;
				}
			} while (!isInteger);
		} while (userEnteredNumber < 1 || userEnteredNumber > 99);
	}

	/**
	 * Compares the user's guess and the random number and displays the result
	 */
	public void play() {
		int gamePlayedCount = 0;
		Scanner userChoice = new Scanner(System.in);
		char choice = 'y';
		do {
			gamePlayedCount++;
			generateRandomInteger();
			getInput();
			if (userEnteredNumber == randomInteger) {
				System.out.println("Congratulation!!");
				System.out.println("Generated No.: " + randomInteger
						+ "\nYour guess: " + userEnteredNumber);
				System.out.println("\nNo. of guesses: " + gamePlayedCount);
				gamePlayedCount = 0;
				System.out.println("Play again?(y/n)");
				choice = userChoice.next().charAt(0);
			} else {
				System.out.println("Wrong guess!!");
				System.out.println("Guess again?(y/n)");
				choice = userChoice.next().charAt(0);
			}
		} while (choice == 'y' || choice == 'Y');
	}
}
