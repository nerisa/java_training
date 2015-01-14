package com.lftechnology.jan12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Create an array list with 49 Integer objects containing the numbers 1 through 49. It then randomly shuffles the list and selects the
 * first 6 values from the shuffled list. Finally, it sorts the selected values and prints them out. Hint: Use ArrayList,
 * Collections.shuffle(), ArrayList.subList(), and Collection.sort().
 * 
 * @author Nerisa Chitrakar nerisachitrakar@lftechnology.com
 * 
 */
public class ArrayListManipulator {
	private static List<Integer> list = new ArrayList<Integer>();
	private static final Logger LOG = Logger.getLogger(ArrayListManipulator.class.getName());

	public static void main(String[] args) {
		for (int i = 1; i < 50; i++) {
			list.add(i);
		}
		LOG.log(Level.INFO, "Main list:");
		displayList(list);
		Collections.shuffle(list);
		LOG.log(Level.INFO, "Shuffled list:");
		displayList(list);
		List<Integer> childList = list.subList(0, 6);
		LOG.log(Level.INFO, "Extracted list:");
		displayList(childList);
		Collections.sort(childList);
		LOG.log(Level.INFO, "Sorted child list:");
		displayList(childList);
	}

	/**
	 * This method displays the list in one line
	 * 
	 * @author Nerisa Chitrakar nerisachitrakar@lftechnology.com
	 * @param list
	 *            {@link List} to be displayed
	 */
	private static void displayList(List<Integer> list) {
		StringBuilder intList = new StringBuilder();
		for (Integer num : list) {
			intList.append(num + " ");
		}
		LOG.log(Level.INFO, "{0}", intList);
	}
}
