package com.lftechnology.jan7;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Logger;

/**
 * This class tests the methods of {@link FileUtility}
 * 
 * @author nerisa
 * 
 */
public class FileUtilityMain {
	private static final Logger LOGGER = Logger.getLogger(FileUtilityMain.class.getName());

	public static void main(String[] args) {
		final String PATH_TO_HOME = System.getProperty("user.home");
		final String PATH_TO_DIRECTORY = "/javatest/";
		final String NEW_FILE = "abc.txt";
		final String NEW_DIRECTORY = "newdir";
		final String FILE_TO_READ = "in.txt";
		FileUtility file = new FileUtility();
		file.createAFile(PATH_TO_HOME + PATH_TO_DIRECTORY + NEW_FILE);
		file.makeDirectory(PATH_TO_HOME + PATH_TO_DIRECTORY + NEW_DIRECTORY);
		// rename a file by accepting the file name from command line arguments
		if (args.length == 2) {
			Path oldFile = Paths.get(args[0]);
			file.renameFile(oldFile, args[1]);
		} else {
			LOGGER.severe("File names missing");
		}
		file.readFile(PATH_TO_HOME + PATH_TO_DIRECTORY + FILE_TO_READ);
		file.displayData();
	}
}
