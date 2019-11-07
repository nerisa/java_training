package com.lftechnology.jan5;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * A program that constantly prompts the user to enter something (using the Scanner class) until the user enters a specific word (such as
 * quit for example)
 * 
 * @author nerisa
 * 
 */
public class ContinuousInput {
	private static final Logger LOG = Logger.getLogger(ContinuousInput.class.getName());

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		StringBuilder userSentence = new StringBuilder();
		String userWord = "";
		final String QUIT = "quit";
		try {
			do {
				System.out.println("Enter something(Enter quit to discontinue)");
				userWord = userInput.nextLine();
				if (!userWord.equalsIgnoreCase(QUIT)) {
					userSentence.append(userWord + " ");

				}
			} while (!userWord.equalsIgnoreCase(QUIT));
		} finally {
			userInput.close();
		}
		LOG.info("User entered: " + userSentence);

	}
}
