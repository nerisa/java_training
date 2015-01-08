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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class has methods to test a file, create directory, rename a file,delete a file and read a file
 * 
 * @author nerisa
 * 
 */
public class FileUtility {
	private static final Logger LOG = Logger.getLogger(FileUtility.class.getName());
	private static Scanner fileScanner;
	private List<Integer> firstNum = new ArrayList<Integer>();
	private List<Float> secondNum = new ArrayList<Float>();
	private List<String> name = new ArrayList<String>();

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
			LOG.log(Level.INFO, "File created:{0}", file.toAbsolutePath());
		} catch (FileAlreadyExistsException e) {
			LOG.log(Level.SEVERE, "{0} file already exists", file.getFileName());
		} catch (IOException e) {
			LOG.log(Level.SEVERE, "create file error. cause: {0}", e.getCause() + e.getMessage());
		}
		LOG.log(Level.INFO, "Directory?:{0}", Files.isDirectory(file));
		LOG.log(Level.INFO, "Regular file?:{0}", Files.isRegularFile(file));
		LOG.log(Level.INFO, "File name:{0}", file.getFileName());
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
				LOG.log(Level.INFO, "{0} directory created", directory.getFileName());
			} catch (IOException e) {
				LOG.log(Level.SEVERE, "Directory could not be created. cause:{0}", e.getCause());
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
				LOG.log(Level.INFO, "{0} renamed to {1}", new Object[] { oldFile.getFileName(), newFile.getFileName() });
			} catch (FileAlreadyExistsException e) {
				LOG.log(Level.SEVERE, "{0} file already exists", newFile.getFileName());
			} catch (IOException e) {
				LOG.log(Level.SEVERE, "cannot rename file {0}", e.getCause());
			}
		} else {
			LOG.log(Level.INFO, "{0} does not exist", oldFile.getFileName());
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
			LOG.log(Level.INFO, "{0} deleted", file.getFileName());
		} catch (IOException e) {
			LOG.log(Level.INFO, "{0} cannot be deleted", file.getFileName());
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
			fileScanner = new Scanner(new BufferedReader(new FileReader(fileName)));
			while (fileScanner.hasNext()) {
				if (fileScanner.hasNextInt()) {
					firstNum.add(fileScanner.nextInt());
				} else if (fileScanner.hasNextFloat()) {
					secondNum.add(fileScanner.nextFloat());
				} else {
					name.add(fileScanner.next());
				}
			}
		} catch (FileNotFoundException e) {
			LOG.log(Level.SEVERE, "File does not exist");
		} finally {
			if (fileScanner != null) {
				fileScanner.close();
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
		String name;
		while (firstNumIterator.hasNext() && secondNumIterator.hasNext() && nameIterator.hasNext()) {
			firstNumber = firstNumIterator.next();
			secondNumber = secondNumIterator.next();
			name = nameIterator.next();
			LOG.log(Level.INFO, "Hi! {0}, the sum of {1} and {2} is {3} ", new Object[] { name, firstNumber, secondNumber,
					(float) (firstNumber + secondNumber) });
		}
	}

}
