package com.lftechnology.jan12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class explores the {@link ArrayList} class has methods to
 * <ol>
 * <li>Add elements to its instance variable</li>
 * <li>Shuffle the elements of the instance variable and retrieve a specified length of sublist</li>
 * <li>Sort the instance variable</li>
 * <li>Display the instance variable</li>
 * </ol>
 * 
 * @author nerisa
 * 
 */
class ArrayListManipulator {
	public List<Integer> list = new ArrayList<Integer>();
	private static final Logger LOG = Logger.getLogger(ArrayListManipulator.class.getName());

	/**
	 * This method adds an element to the instance variable.
	 * 
	 * @author nerisa
	 * @param element
	 */
	public void addElement(int element) {
		list.add(element);
	}

	/**
	 * This method shuffles the instance variable and returns the specified length sublist of the instance variable
	 * 
	 * @author nerisa
	 * @param fromIndex
	 *            specifies the starting index to extract the sublist
	 * @param toIndex
	 *            specifies the ending index of the sublist
	 * @return an instance of the class with the sublist as its instance variable
	 */
	public ArrayListManipulator shuffleAndRetrieve(int fromIndex, int toIndex) {
		ArrayListManipulator subList = new ArrayListManipulator();
		Collections.shuffle(this.list);
		subList.list = list.subList(fromIndex, toIndex);
		return subList;
	}

	/**
	 * @author nerisa
	 */
	public void sort() {
		Collections.sort(list);
	}

	/**
	 * @author nerisa
	 */
	public void display() {
		StringBuilder intList = new StringBuilder();
		for (Integer num : list) {
			intList.append(num + " ");
		}
		LOG.log(Level.INFO, "{0}", intList);
	}
}
