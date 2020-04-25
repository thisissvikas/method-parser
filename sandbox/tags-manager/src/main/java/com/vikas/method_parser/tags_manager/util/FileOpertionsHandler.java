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
    public static String getTempUserDirectory() {
    	return System.getProperty("java.io.tmpdir");
    }
    
    /**
     * Create a folder inside the temporary directory.
     * @return path of the new folder 
     */
    public static String createFolderInTempDirectory() {
    	String path = getTempUserDirectory() + "/Method_Parser_CTags";
    	new File(path).mkdirs();
    	return path;
    }
}
