package com.lftechnology.jan7;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Logger;

/**
 * Write a program to create a text file in the path c:\java\abc.txt and check whether that file is exists. Using the command exists(),
 * isDirectory(), isFile(), getName() and getAbsolutePath().
 * 
 * @author nerisa
 * 
 */
public class FileTest {
	private static final Logger LOG = Logger.getLogger(FileTest.class.getName());

	public static void main(String[] args) {
		Path file = Paths.get("/home/nerisa/javatest/abc.txt");
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

}
