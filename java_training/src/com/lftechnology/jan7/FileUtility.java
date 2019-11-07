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
	private List<Integer> intNumbers = new ArrayList<Integer>();
	private List<Float> floatNumbers = new ArrayList<Float>();
	private List<String> names = new ArrayList<String>();

	/**
	 * Creates a text file and checks whether that file is exists. Using the command exists(), isDirectory(), isFile(), getName() and
	 * getAbsolutePath().
	 * 
	 * @author nerisa
	 * 
	 * @param pathName
	 *            Name of the file to be created
	 */
	public void createAFile(String pathName) {
		Path file = Paths.get(pathName);
		try {
			Files.createFile(file);
			LOG.log(Level.INFO, "File created:{0}", file.toAbsolutePath());
		} catch (FileAlreadyExistsException e) {
			LOG.log(Level.SEVERE, "{0} file already exists", file.getFileName());
		} catch (IOException e) {
			LOG.log(Level.SEVERE, "create file error. cause: {0}", e.getCause() + e.getMessage());
		} catch (Exception e) {
			LOG.log(Level.SEVERE, "{0}, cause:{1}", new Object[] { e.getMessage(), e.getCause() });
		}
		LOG.log(Level.INFO, "Directory?:{0}", Files.isDirectory(file));
		LOG.log(Level.INFO, "Regular file?:{0}", Files.isRegularFile(file));
		LOG.log(Level.INFO, "File name:{0}", file.getFileName());
	}

	/**
	 * Creates a directory and checks whether the directory is created.
	 * 
	 * @author nerisa
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
			} catch (Exception e) {
				LOG.log(Level.SEVERE, "{0}, cause:{1}", new Object[] { e.getMessage(), e.getCause() });
			}
		}
	}

	/**
	 * Renames the given file
	 * 
	 * @author nerisa
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
			} catch (Exception e) {
				LOG.log(Level.SEVERE, "{0}, cause:{1}", new Object[] { e.getMessage(), e.getCause() });
			}
		} else {
			LOG.log(Level.INFO, "{0} does not exist", oldFile.getFileName());
		}
	}

	/**
	 * Deletes the given file
	 * 
	 * @author nerisa
	 * @param filePath
	 *            path of the file to be deleted
	 */
	public void deleteFile(Path filePath) {
		try {
			Files.deleteIfExists(filePath);
			LOG.log(Level.INFO, "{0} deleted", filePath.getFileName());
		} catch (IOException e) {
			LOG.log(Level.INFO, "{0} cannot be deleted", filePath.getFileName());
		} catch (Exception e) {
			LOG.log(Level.SEVERE, "{0}, cause:{1}", new Object[] { e.getMessage(), e.getCause() });
		}
	}

	/**
	 * Reads a file with integer,string and float data
	 * 
	 * @author nerisa
	 * @param fileName
	 *            file to be read
	 */
	public void readFile(String fileName) {
		try {
			fileScanner = new Scanner(new BufferedReader(new FileReader(fileName)));
			while (fileScanner.hasNext()) {
				if (fileScanner.hasNextInt()) {
					intNumbers.add(fileScanner.nextInt());
				} else if (fileScanner.hasNextFloat()) {
					floatNumbers.add(fileScanner.nextFloat());
				} else {
					names.add(fileScanner.next());
				}
			}
		} catch (FileNotFoundException e) {
			LOG.log(Level.SEVERE, "File does not exist");
		} catch (Exception e) {
			LOG.log(Level.SEVERE, "{0}, cause:{1}", new Object[] { e.getMessage(), e.getCause() });
		} finally {
			if (fileScanner != null) {
				fileScanner.close();
			}
		}
	}

	/**
	 * 
	 * Displays the data in the file and the sum of all the numbers present in the file
	 * 
	 * @author nerisa
	 */
	public void displayData() {
		if (names.isEmpty() && intNumbers.isEmpty() && floatNumbers.isEmpty()) {
			LOG.log(Level.INFO, "The file is empty");
		} else {
			StringBuilder namesInFile = new StringBuilder();
			StringBuilder intNumsInFile = new StringBuilder();
			StringBuilder floatNumsInFile = new StringBuilder();
			float sum = 0;
			for (int number : intNumbers) {
				intNumsInFile.append(number + " ");
				sum += number;
			}
			for (float number : floatNumbers) {
				floatNumsInFile.append(number + " ");
				sum += number;
			}
			for (String name : names) {
				namesInFile.append(name + " ");
			}
			LOG.log(Level.INFO, "The names in the file are: {0}", namesInFile);
			LOG.log(Level.INFO, "The integers in the file are: {0}", intNumsInFile);
			LOG.log(Level.INFO, "The floats in the file are: {0}", floatNumsInFile);
			LOG.log(Level.INFO, "Hi! {0}, the sum of all nos in the file is {1} ", new Object[] { namesInFile, sum });
		}
	}
}
