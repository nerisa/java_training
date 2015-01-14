package com.lftechnology.jan12;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class explores the functionalities of {@link WordListManipulator}
 * 
 * @author Nerisa Chitrakar nerisachitrakar@lftechnology.com
 * 
 */
public class WordListMain {
	private static final Logger LOG = Logger.getLogger(WordListMain.class.getName());

	public static void main(String[] args) {
		WordListManipulator wordList = new WordListManipulator();
		List<String> words = Arrays.asList(args);
		StringBuilder noDuplicatesList = new StringBuilder();
		StringBuilder duplicateList = new StringBuilder();
		StringBuilder uniqueList = new StringBuilder();
		for (String word : wordList.removeDuplicates(words)) {
			noDuplicatesList.append(word + " ");
		}
		for (String word : wordList.findDuplicates(words)) {
			duplicateList.append(word + " ");
		}
		for (String word : wordList.findUniques(words)) {
			uniqueList.append(word + " ");
		}
		LOG.log(Level.INFO, "The list with duplicates removed is {0}", noDuplicatesList);
		LOG.log(Level.INFO, "The duplicate words are {0}", duplicateList);
		LOG.log(Level.INFO, "The unique words are {0}", uniqueList);
		LOG.log(Level.INFO, "The repetition count for the duplicate words are:");
		wordList.displayRepetitionCount(wordList.findRepetitionCount(words));

		LOG.log(Level.INFO, "Original List:");
		wordList.displayList(words);
		wordList.shuffleAndDisplay(words);
	}
}
