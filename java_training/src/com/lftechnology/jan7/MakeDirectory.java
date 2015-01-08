package com.lftechnology.jan7;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Logger;

/**
 * A program to create a directory and check whether the directory is created.
 * 
 * @author nerisa
 * 
 */
public class MakeDirectory {
	private static final Logger LOG = Logger.getLogger(MakeDirectory.class.getName());
	final static int ERROR = 1;

	public static void main(String[] args) {
		Path directory = Paths.get("/home/nerisa/javatest/newdir");
		if (Files.exists(directory)) {
			LOG.severe("Directory already exists");
			System.exit(ERROR);
		}
		try {
			Files.createDirectories(directory);

		} catch (FileAlreadyExistsException e) {
			LOG.severe("A file with " + directory.getFileName() + " already exists");

		} catch (IOException e) {
			LOG.severe("Directory could not be created");
		}

	}

}
