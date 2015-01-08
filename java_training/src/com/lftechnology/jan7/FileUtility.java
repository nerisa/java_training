package com.lftechnology.jan7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * This class has methods to test a file, create directory, rename a file,delete a file and read a file
 * 
 * @author nerisa
 * 
 */
public class FileUtility {
	private static final Logger LOG = Logger.getLogger(FileUtility.class.getName());
	private static Scanner s;
	private static List<Integer> firstNum = new ArrayList<Integer>();
	private static List<Float> secondNum = new ArrayList<Float>();
	private static List<String> name = new ArrayList<String>();

	/**
	 * Creates a text file and checks whether that file is exists. Using the command exists(), isDirectory(), isFile(), getName() and
	 * getAbsolutePath().
	 * 
	 * @param pathName
	 *            Name of the file to be created
	 */
	public void testAFile(String pathName) {
		Path file = Paths.get(pathName);
		try {
			Files.createFile(file);
			LOG.info("File created:" + file.toAbsolutePath());
		} catch (FileAlreadyExistsException e) {
			LOG.severe("File already exists");
		} catch (IOException e) {
			LOG.severe("create file error");
		}
		LOG.info("Directory?:" + Files.isDirectory(file));
		LOG.info("Regular file?:" + Files.isRegularFile(file));
		LOG.info("File name:" + file.getFileName());
	}

	/**
	 * Creates a directory and checks whether the directory is created.
	 * 
	 * @param pathName
	 *            name of the directory to be created
	 * 
	 */
	public void makeDirectory(String pathName) {
		Path directory = Paths.get(pathName);
		if (Files.exists(directory)) {
			LOG.severe("Directory already exists");
		} else {
			try {
				Files.createDirectories(directory);
				LOG.info(directory.getFileName() + " directory created");
			} catch (FileAlreadyExistsException e) {
				LOG.severe("A file with " + directory.getFileName() + " already exists");
			} catch (IOException e) {
				LOG.severe("Directory could not be created");
			}
		}

	}

	/**
	 * Renames the given file
	 * 
	 * @param oldFile
	 *            file to be renamed
	 * @param newName
	 *            new name of the file
	 */
	public void renameFile(Path oldFile, String newName) {
		Path newFile = oldFile.resolveSibling(Paths.get(newName));
		if (Files.exists(oldFile)) {
			try {
				Files.move(oldFile, newFile);
				LOG.info(oldFile.getFileName() + " renamed to " + newFile.getFileName());
			} catch (IOException e) {
				LOG.severe("cannot rename file");
			}
		} else {
			LOG.info(oldFile.getFileName() + " does not exist");
		}
	}

	/**
	 * Deletes the given file
	 * 
	 * @param file
	 *            file to be deleted
	 */
	public void deleteFile(Path file) {
		try {
			Files.deleteIfExists(file);
			LOG.info(file.getFileName() + " deleted");
		} catch (IOException e) {
			LOG.severe(file.getFileName() + " cannot be deleted");
		}
	}

	/**
	 * Reads a file with integer,string and float data
	 * 
	 * @param fileName
	 *            file to be read
	 */
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

	/**
	 * Displays the data in the file
	 * 
	 */
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
