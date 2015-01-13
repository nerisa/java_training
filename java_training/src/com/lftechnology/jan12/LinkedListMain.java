package com.lftechnology.jan12;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class explores the functionalities of {@link LinkedListManipulator} class.
 * 
 * @author nerisa
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

/**
 * This class has methods to
 * <ol>
 * <li>Create a linked list named one and two.</li>
 * <li>Add some elements to both one (one, two, three, four, five) and two (six, seven, eight, nine, and ten).</li>
 * <li>Merge the words from two into one.</li>
 * <li>Remove every second word from two.</li>
 * <li>Remove all words in two from one.</li>
 * </ol>
 * li>Print the value after each operation.</li>
 * 
 * @author nerisa
 * 
 */

class LinkedListManipulator {
	private List<String> list = new LinkedList<String>();
	private static final Logger LOG = Logger.getLogger(LinkedListManipulator.class.getName());

	/**
	 * This method adds elements to the instance variable
	 * 
	 * @author nerisa
	 * @param elements
	 *            to be added
	 */
	public void addElements(String[] elements) {
		for (String word : elements) {
			list.add(word);
		}
	}

	/**
	 * @author nerisa
	 * @return the instance variable list
	 */
	public List<String> getList() {
		return list;
	}

	/**
	 * This method appends the values of the instance variable of the passed instance of the class to the instance variable of the calling
	 * instance
	 * 
	 * @author nerisa
	 * @param anotherInstance
	 */
	public void mergeLists(LinkedListManipulator anotherInstance) {
		this.list.addAll(anotherInstance.getList());
	}

	/**
	 * This method removes every second element of the instance variable. For e.g. for the list ['one','two','three','four'], the result
	 * will be ['one','three']
	 * 
	 * @author nerisa
	 */
	public void removeSecondElements() {
		List<String> tempList = new LinkedList<String>();
		for (int i = 1; i < list.size(); i = i + 2) {
			tempList.add(list.get(i));
		}
		list.removeAll(tempList);
	}

	/**
	 * This method removes the elements present in the instance variable of the passed instance of the class from the instance variable of
	 * the calling instance
	 * 
	 * @author nerisa
	 * @param anotherInstance
	 */
	public void removeElements(LinkedListManipulator anotherInstance) {
		this.list.removeAll(anotherInstance.getList());
	}

	/**
	 * This method displays the instance variable
	 * 
	 * @author nerisa
	 */
	public void displayList() {
		StringBuilder listOfWords = new StringBuilder();
		for (String word : list) {
			listOfWords.append(word + " ");
		}
		LOG.log(Level.INFO, "{0}", listOfWords);
	}
}
