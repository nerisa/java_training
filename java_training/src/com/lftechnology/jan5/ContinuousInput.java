package com.lftechnology.jan5;

import java.util.Scanner;
import java.util.logging.Logger;

public class ContinuousInput {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		Logger LOG = Logger.getLogger("myLogger");
		StringBuilder userSentence = new StringBuilder();
		String userWord = "";
		try {
			do {
				System.out
						.println("Enter something(Enter quit to discontinue)");
				userWord = userInput.next();
				if (!userWord.equalsIgnoreCase("quit")) {
					userSentence.append(userWord + " ");

				}
			} while (!userWord.equalsIgnoreCase("quit"));
		} finally {
			userInput.close();
		}
		LOG.info("User entered " + userSentence);

	}
}
