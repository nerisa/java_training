package com.lftechnology.jan5;

import java.util.Arrays;
import java.util.logging.Logger;

/**
 * Main class to explore the functionalities of class {@link MyArray}
 * 
 * @author nerisa
 * 
 */
public class MyArrayMain {

	public static void main(String[] args) {
		String[] array = { "abc", "bcd", "ef", "g", "h" };
		String[] comparisonArray = { "h", "ef", "bcd", "abc", "g" };
		MyArray myArray = new MyArray(array);
		myArray.searchInArray("nerisa");
		MyArray comparisonMyArray = new MyArray(comparisonArray);
		myArray.compareInOrder(comparisonMyArray);
		myArray.compare(comparisonMyArray);
	}

}

/**
 * This class has methods to search for a certain value in an array of integer String type and float type,compare if the two arrays has the
 * same content in the same order as well as in different order.
 * 
 * @author nerisa
 * 
 */
class MyArray {
	private String[] array;
	private static final Logger LOG = Logger.getLogger(MyArray.class.getName());

	public MyArray() {

	}

	/**
	 * Constructor for array of type String that sets the instance variables
	 * 
	 * @param stringArray
	 */
	public MyArray(String[] stringArray) {
		this.array = new String[stringArray.length];
		for (int i = 0; i < stringArray.length; i++) {
			this.array[i] = stringArray[i];
		}
	}

	/**
	 * Constructor for arrays of type int that sets the instance variables
	 * 
	 * @param intArray
	 */
	public MyArray(int[] intArray) {
		this.array = new String[intArray.length];
		for (int i = 0; i < intArray.length; i++) {
			this.array[i] = Integer.toString(intArray[i]);
		}
	}

	/**
	 * Constructor for array of type float that sets the instance variables
	 * 
	 * @param floatArray
	 */
	public MyArray(float[] floatArray) {
		this.array = new String[floatArray.length];
		for (int i = 0; i < floatArray.length; i++) {
			this.array[i] = Float.toString(floatArray[i]);
		}
	}

	/**
	 * @return instance variable array
	 */
	public String[] getArray() {
		return array;
	}

	/**
	 * Searches for a value in the array and prints all the indexes of the value
	 * 
	 * @param key
	 *            value to be searched.It has to be entered as String.
	 */
	public void searchInArray(String key) {
		boolean keyFound = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i].equalsIgnoreCase(key)) {
				keyFound = true;
				LOG.info("Found " + key + "at:" + i);
			}
		}
		if (!keyFound) {
			LOG.info(key + " not found");
		}

	}

	/**
	 * Compares if two arrays have the same content in the same order
	 * 
	 * @param comparedArray
	 *            array to be compared
	 * 
	 */
	public void compareInOrder(MyArray compareArray) {
		int numberOfSameElements = 0;
		if (array.length == compareArray.getArray().length) {
			for (int i = 0; i < array.length; i++) {
				if (array[i].equalsIgnoreCase(compareArray.getArray()[i])) {
					numberOfSameElements++;
				}
			}
			if (numberOfSameElements == array.length) {
				LOG.info("Arrays identical");
			} else {
				LOG.info("Arrays not identical");
			}
		} else {
			LOG.info("Arrays cannot be compared");
		}
	}

	/**
	 * Compares if the two arrays are equal irrespective of the order of elements
	 * 
	 * @param compareArray
	 *            array to be compared
	 */
	public void compare(MyArray compareArray) {
		int numberOfEqualElements = 0;
		if (array.length == compareArray.getArray().length) {
			String[] firstTempArray = compareArray.getArray().clone();
			String[] secondTempArray = array.clone();
			Arrays.sort(firstTempArray);
			Arrays.sort(secondTempArray);
			for (int i = 0; i < firstTempArray.length; i++) {
				if (firstTempArray[i].equalsIgnoreCase(secondTempArray[i])) {
					numberOfEqualElements++;
				}
			}
			if (numberOfEqualElements == array.length) {
				LOG.info("Equal arrays");
			} else {
				LOG.info("Arrays not equal");
			}
		} else {
			LOG.info("Arrays cannot be compared");

		}

	}

}
