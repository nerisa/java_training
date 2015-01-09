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
	private static final Logger LOGGER = Logger.getLogger(FileUtility.class.getName());

	public static void main(String[] args) {
		FileUtility file = new FileUtility();
		file.createAFile("/home/nerisa/javatest/abc.txt");
		file.makeDirectory("/home/nerisa/javatest/newdir");
		// rename a file by accepting the file name from command line arguments
		if (args.length == 2) {
			Path oldFile = Paths.get(args[0]);
			file.renameFile(oldFile, args[1]);
		} else {
			LOGGER.severe("File names missing");
		}
		file.readFile("/home/nerisa/javatest/in.txt");
		file.displayData();
	}

}
