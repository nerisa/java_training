package com.lftechnology.jan7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.logging.Logger;

public class FileInputMain {
	public static void main(String[] args) {
		FileInput file = new FileInput();
		file.readFile("/home/nerisa/javatest/in.txt");
		file.displayData();

	}

}

/**
 * Write a program called FileInput to read an int, a double, and a String form a text file called "in.txt", and produce the following
 * output: (Hint use Scanner to read from file) a. The integer read is 12 b. The floating point number read is 33.44 c. The String read
 * is"Peter" d. Hi! Peter, the sum of 12 and 33.44 is 45.44
 * 
 * @author nerisa
 * 
 */
class FileInput {
	private static final Logger LOG = Logger.getLogger(FileInputMain.class.getName());
	private static Scanner s = null;
	private static List<Integer> firstNum = new ArrayList<Integer>();
	private static List<Float> secondNum = new ArrayList<Float>();
	private static List<String> name = new ArrayList<String>();

	public void readFile(String fileName) {
		try {
			s = new Scanner(new BufferedReader(new FileReader(fileName)));
			while (s.hasNext()) {
				if (s.hasNextInt()) {
					firstNum.add(s.nextInt());
				} else if (s.hasNextFloat()) {
					secondNum.add(s.nextFloat());
				} else {
					name.add(s.next());
				}
			}
		} catch (FileNotFoundException e) {
			LOG.severe("File does not exist");
		} finally {
			if (s != null) {
				s.close();
			}
		}
	}

	public void displayData() {
		ListIterator<Integer> firstNumIterator = firstNum.listIterator();
		ListIterator<Float> secondNumIterator = secondNum.listIterator();
		ListIterator<String> nameIterator = name.listIterator();
		int firstNumber = 0;
		float secondNumber = 0;
		while (firstNumIterator.hasNext() && secondNumIterator.hasNext() && nameIterator.hasNext()) {
			firstNumber = firstNumIterator.next();
			secondNumber = secondNumIterator.next();
			LOG.info("Hi! " + nameIterator.next() + ",the sum of " + firstNumber + " and " + secondNumber + " is "
					+ (float) (firstNumber + secondNumber));
		}
	}

}
