package com.lftechnology.jan12;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class makes use of the Collections API and has methods to
 * <ul>
 * <li>find the duplicates in a word list</li>
 * <li>find the unique words in a word list</li>
 * <li>count the number of duplicates</li>
 * <li>display the word list with duplicates removed</li>
 * <li>to makes use of the Shuffle algorithm</li>
 * </ul>
 * 
 * @author Nerisa Chitrakar nerisachitrakar@lftechnology.com
 * 
 */
public class WordListManipulator {
	private static final Logger LOG = Logger.getLogger(WordListManipulator.class.getName());

	/**
	 * This method removes any repeating words from a list of words.
	 * 
	 * @author Nerisa Chitrakar nerisachitrakar@lftechnology.com
	 * @param listOfWords
	 *            {@link List} of words from where the duplicates are to be removed
	 * @return {@link List} of words with duplicates removed
	 */
	public Set<String> removeDuplicates(List<String> listOfWords) {
		return (new HashSet<String>(listOfWords));
	}

	/**
	 * This method finds the repeating words in a list of words.
	 * 
	 * @author Nerisa Chitrakar nerisachitrakar@lftechnology.com
	 * @param listOfWords
	 *            {@link List} of words from where the duplicates are to be found
	 * @return {@link List} of duplicates words
	 */
	public Set<String> findDuplicates(List<String> listOfWords) {
		Set<String> noDuplicates = removeDuplicates(listOfWords);
		Set<String> duplicates = new HashSet<String>();
		for (String word : noDuplicates) {
			if (Collections.frequency(listOfWords, word) > 1) {
				duplicates.add(word);

			}
		}
		return duplicates;
	}

	/**
	 * This method finds the non-repeating words from a list of words.
	 * 
	 * @author Nerisa Chitrakar nerisachitrakar@lftechnology.com
	 * @param listOfWords
	 *            {@link List} of words from where the unique words are to be found
	 * @return {@link List} of unique words
	 */
	public Set<String> findUniques(List<String> listOfWords) {
		Set<String> noDuplicates = removeDuplicates(listOfWords);
		noDuplicates.removeAll(findDuplicates(listOfWords));
		return noDuplicates;
	}

	/**
	 * This method finds the number of times the duplicate words is repeated.
	 * 
	 * @author Nerisa Chitrakar nerisachitrakar@lftechnology.com
	 * @param listOfWords
	 *            {@link List} of words form where the duplicates are to be found
	 * @return returns the duplicates with its repetition count in the form of {@link Map}
	 */
	public Map<String, Integer> findRepetitionCount(List<String> listOfWords) {
		Map<String, Integer> duplicates = new HashMap<String, Integer>();
		Set<String> duplicateList = findDuplicates(listOfWords);
		for (String word : duplicateList) {
			duplicates.put(word, Collections.frequency(listOfWords, word));
		}
		return duplicates;
	}

	/**
	 * This method displays the duplicates with its repetition count
	 * 
	 * @author Nerisa Chitrakar nerisachitrakar@lftechnology.com
	 * @param map
	 *            {@link Map} that contains the duplicates with its repetition count
	 */
	public void displayRepetitionCount(Map<String, Integer> map) {
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			LOG.log(Level.INFO, "{0}:{1}", new Object[] { entry.getKey(), entry.getValue() });
		}
	}

	/**
	 * This method shuffles the list of words and displays it
	 * 
	 * @author Nerisa Chitrakar nerisachitrakar@lftechnology.com
	 * @param listOfWords
	 *            {@link List} of words to be shuffled
	 */
	public void shuffleAndDisplay(List<String> listOfWords) {
		Collections.shuffle(listOfWords);
		StringBuilder shuffledList = new StringBuilder();
		for (String word : listOfWords) {
			shuffledList.append(word + " ");
		}
		LOG.log(Level.INFO, "Shuffled list:{0}", shuffledList);
	}

	/**
	 * Displays the list of words
	 * 
	 * @author Nerisa Chitrakar nerisachitrakar@lftechnology.com
	 * @param listOfWords
	 *            {@link List} of words to be displayed
	 */
	public void displayList(List<String> listOfWords) {
		StringBuilder unshuffledList = new StringBuilder();
		for (String word : listOfWords) {
			unshuffledList.append(word + " ");
		}
		LOG.log(Level.INFO, "{0}", unshuffledList);
	}
}
