package com.lftechnology.jan12;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class explores the functionalities of {@link LinkedListManipulator} class to do the following:
 * <ol>
 * <li>Create a linked list named one and two.</li>
 * <li>Add some elements to both one (one, two, three, four, five) and two (six, seven, eight, nine, and ten).</li>
 * <li>Merge the words from two into one.</li>
 * <li>Remove every second word from two.</li>
 * <li>Remove all words in two from one.</li>
 * </ol>
 * Print the value after each operation.
 * 
 * @author Nerisa Chitrakar nerisachitrakar@lftechnology.com
 * 
 */
public class LinkedListMain {
	private static final Logger LOG = Logger.getLogger(LinkedListMain.class.getName());

	public static void main(String[] args) {
		LinkedListManipulator one = new LinkedListManipulator();
		LinkedListManipulator two = new LinkedListManipulator();
		one.addElements(new String[] { "one", "two", "three", "four", "five" });
		two.addElements(new String[] { "six", "seven", "eight", "nine", "ten" });
		LOG.log(Level.INFO, "After adding elements:");
		one.displayList();
		two.displayList();

		one.mergeLists(two);
		LOG.log(Level.INFO, "After merging two into one:");
		one.displayList();

		LOG.log(Level.INFO, "Removing every second element from two:");
		two.removeSecondElements();
		two.displayList();

		LOG.log(Level.INFO, "Removing elements in two from one");
		one.removeElements(two);
		one.displayList();
	}
}
