package com.lftechnology.jan12;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class has a {@link LinkedList} variable and has methods to
 * <ol>
 * <li>Add elements to the list</li>
 * <li>Merge the words from one instance to another instance.</li>
 * <li>Remove every second word from the instance variable</li>
 * <li>Remove all words present in another instance.</li>
 * <li>Print the instance variable.</li>
 * </ol>
 * 
 * @author Nerisa Chitrakar nerisachitrakar@lftechnology.com
 * 
 */

class LinkedListManipulator {
	private List<String> list = new LinkedList<String>();
	private static final Logger LOG = Logger.getLogger(LinkedListManipulator.class.getName());

	/**
	 * This method adds elements to the instance variable
	 * 
	 * @author Nerisa Chitrakar nerisachitrakar@lftechnology.com
	 * @param elements
	 *            array of {@link String} elements to be added
	 */
	public void addElements(String[] elements) {
		for (String word : elements) {
			this.list.add(word);
		}
	}

	/**
	 * @author Nerisa Chitrakar nerisachitrakar@lftechnology.com
	 * @return the instance variable list
	 */
	public List<String> getList() {
		return this.list;
	}

	/**
	 * This method appends the values of the instance variable of the passed object of the class to the instance variable of the calling
	 * object
	 * 
	 * @author Nerisa Chitrakar nerisachitrakar@lftechnology.com
	 * @param anotherInstance
	 *            an instance of {@link LinkedListManipulator} whose variable is to be merged
	 */
	public void mergeLists(LinkedListManipulator anotherInstance) {
		this.list.addAll(anotherInstance.getList());
	}

	/**
	 * This method removes every second element of the instance variable. For e.g. for the list ['one','two','three','four'], the result
	 * will be ['one','three']
	 * 
	 * @author Nerisa Chitrakar nerisachitrakar@lftechnology.com
	 */
	public void removeSecondElements() {
		for (int i = 1; i < this.list.size(); i++) {
			this.list.remove(i);
		}
	}

	/**
	 * This method removes the elements present in the instance variable of the passed instance of the class from the instance variable of
	 * the calling instance
	 * 
	 * @author Nerisa Chitrakar nerisachitrakar@lftechnology.com
	 * @param anotherInstance
	 */
	public void removeElements(LinkedListManipulator anotherInstance) {
		this.list.removeAll(anotherInstance.getList());
	}

	/**
	 * This method displays the instance variable
	 * 
	 * @author Nerisa Chitrakar nerisachitrakar@lftechnology.com
	 */
	public void displayList() {
		LOG.log(Level.INFO, "{0}", this.list);
	}
}
