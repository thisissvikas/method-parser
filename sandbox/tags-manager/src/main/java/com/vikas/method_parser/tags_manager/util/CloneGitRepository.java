package com.vikas.method_parser.tags_manager.util;

import java.io.File;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;

/**
 * To checkout a git repository to a path from the given url.
 *
 */
public class CloneGitRepository {
	/**
	 * 
	 * @param URL : URL of the repository to be cloned.
	 * @param checkoutPath : Path in which the repo will be cloned.
	 */
	 public void checkoutRepo(String URL, String checkoutPath) {
	      try {
	        Git.cloneRepository()
	            .setURI(URL)
	            .setDirectory(new File(checkoutPath))
	            .call();
	      } catch (GitAPIException e) {
	        // Todo: Implement the logger and handle this.
	        e.printStackTrace();
	      }
	    }
}
