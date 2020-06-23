package com.vikas.method_parser.tags_manager.util;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * To manage the path operations.
 *
 */
public class PathOperationManager {
	private final static Logger logger = LoggerFactory.getLogger(PathOperationManager.class);
	
	/**
     * Get temporary directory/folder.
     * @return the path of the temporary folder
     */
    public static String getTemporaryFileDirectory() {
    	return System.getProperty("java.io.tmpdir");
    }
    
    
    /**
     * To check if the given location is valid or not.
     * @param path : Location given
     * @return true : if the path is valid.
     * 		   false : if the path is not valid.
     */
    private static Boolean isPathValid(String path) {
    	File file = new File(path);
    	if(file.exists()) {
    		return true;
    	}
    	return false;
    }
    
    /**
     * Create a folder inside user-given location.
     * @return path of the new folder 
     */
    public static String createMethodParserFolder(String location) {
    	String path = location + "\\method-parser";
    	File file = new File(location);
		if(isPathValid(location) && file.canWrite()) {
			new File(path).mkdirs();
		} else {
			logger.error("Given path is not valid or user does not have write access.");
		}
    	return path;
    }
}
