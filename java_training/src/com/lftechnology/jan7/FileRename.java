package com.lftechnology.jan7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Logger;

/**
 * Write a program to rename the given file, after renaming the file delete the renamed file. (Accept the file name using command line
 * arguments.)
 * 
 * @author nerisa
 * 
 */
public class FileRename {
	private static final Logger LOG = Logger.getLogger(FileRename.class.getName());

	public static void main(String[] args) {
		Path oldName = Paths.get(args[0]);
		Path newName = Paths.get(args[1]);
		if (args.length < 2) {
			LOG.severe("File names missing");
		} else {
			newName = oldName.resolveSibling(newName);
			if (Files.exists(oldName)) {
				try {
					Files.move(oldName, newName);
					LOG.info(oldName.getFileName() + " renamed to " + newName.getFileName());

					Files.delete(newName);
					LOG.info(newName.getFileName() + " deleted");

				} catch (IOException e) {
					LOG.severe("cannot rename file");
				}
			} else {
				LOG.info(oldName.getFileName() + " does not exist");
			}

		}
	}
}
