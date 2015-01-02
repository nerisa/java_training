package com.lftechnology.december31;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.ListIterator;
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

/**
 * Controls the game play
 * 
 * @author nerisa
 * 
 */
class GuessingGame {
	private int userEnteredNumber = 0;
	private LinkedList<Integer> userGuesses = new LinkedList<Integer>();
	private int randomInteger = 0;
	Scanner userInput = new Scanner(System.in);

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
		boolean isInteger = false;
		do {
			System.out.println("Enter your guess between 1 and 100");
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
		} while (userEnteredNumber < 2 || userEnteredNumber > 99);
	}

	/**
	 * Compares the user's guess and the random number
	 */
	public void play() {
		char guessAgain = 'n';
		generateRandomInteger();
		try {
			do {
				if (guessAgain == 'y' || guessAgain == 'Y') {
					if (userEnteredNumber < randomInteger) {
						System.out.println("Hint:Guess higher");
					} else {
						System.out.println("Hint:Guess lower");
					}
				}
				getInput();
				userGuesses.add(userEnteredNumber);
				if (userEnteredNumber == randomInteger) {
					System.out.println("Congratulation!!");
					guessAgain = 'n';
				} else {
					System.out.println("Wrong guess!!");
					System.out.println("Guess again?(y/n)");
					guessAgain = userInput.next().charAt(0);
				}
			} while ((guessAgain == 'y' || guessAgain == 'Y')
					&& userGuesses.size() < 5);
			displayResult();
		} finally {
			userInput.close();
		}
	}

	/**
	 * Displays the result of the game
	 */
	private void displayResult() {
		if (userGuesses.size() == 5) {
			System.out.println("No guesses left");
		}
		System.out.println("No. of guesses: " + userGuesses.size());
		System.out.println("Generated No.: " + randomInteger);
		ListIterator<Integer> userGuessesIterator = userGuesses.listIterator();
		System.out.println("Your guesses:");
		while (userGuessesIterator.hasNext()) {
			System.out.println(userGuessesIterator.next());
		}

	}
}