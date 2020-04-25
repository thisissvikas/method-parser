package com.vikas.method_parser.tags_manager.provider;

import com.vikas.method_parser.tags_manager.model.Tag;
import java.io.File;
import java.util.List;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;


public class CTAGSProvider implements TagsProvider{
	
    @Override
    public List<Tag> getTags() {
        return null;
    }
    
    /**
     * To checkout ctags in the temp folder.
     * @param cTagsURL : URL to clone CTags
     * @param checkoutPath : Path in which the CTags folder will be checked out
     */
    public static void checkoutCTags(String cTagsURL, String checkoutPath) {
      try {
        Git.cloneRepository()
            .setURI(cTagsURL)
            .setDirectory(new File(checkoutPath))
            .call();
      } catch (GitAPIException e) {
        // Todo: Implement the logger and handle this.
        e.printStackTrace();
      }
    }
    
}