package com.vikas.method_parser.tags_manager.util;

import java.io.File;

/**
 * To handle the file operations.
 *
 */
public class FileOpertionsHandler {
	/**
     * Get temporary directory/folder.
     * @return the path of the temporary folder
     */
    public static String getTempraryFileDirectory() {
    	return System.getProperty("java.io.tmpdir");
    }
    
    /**
     * Get the folder name from user.
     * @return Name of the folder
     */
    public static String getLocationFromUser() {
    	String name = null;
    	return name;
    }
    
    /**
     * Create a folder inside the temporary directory.
     * @return path of the new folder 
     */
    public static String createFolderInTempDirectory() {
    	String path = getTempraryFileDirectory() + "\\method-parser";
    	new File(path).mkdirs();
    	return path;
    }
    
    /**
     * Create a folder inside user-given location.
     * @return path of the new folder 
     */
    public static String createFolderInUserGivenLocation() {
    	String path = getLocationFromUser() + "\\method-parser";
    	new File(path).mkdirs();
    	return path;
    }
}
