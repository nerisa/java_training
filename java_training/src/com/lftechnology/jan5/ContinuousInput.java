package com.lftechnology.jan5;

import java.util.Scanner;
import java.util.logging.Logger;

public class ContinuousInput {
	private static Logger log = Logger.getLogger(ContinuousInput.class.getName());

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		StringBuilder userSentence = new StringBuilder();
		String userWord = "";
		final String QUIT = "quit";
		try {
			do {
				System.out.println("Enter something(Enter quit to discontinue)");
				userWord = userInput.next();
				if (!userWord.equalsIgnoreCase(QUIT)) {
					userSentence.append(userWord + " ");

				}
			} while (!userWord.equalsIgnoreCase(QUIT));
		} finally {
			userInput.close();
		}
		log.info("User entered: " + userSentence);

	}
}
