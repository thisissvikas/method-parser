package com.vikas.method_parser.tags_manager.provider;

import com.vikas.method_parser.tags_manager.model.Tag;
import com.vikas.method_parser.tags_manager.util.CloneGitRepository;

import java.util.List;


public class CTAGSProvider implements TagsProvider{
	static CloneGitRepository cloneRepo = new CloneGitRepository();
	
    @Override
    public List<Tag> getTags() {
        return null;
    }
    
    /**
     * To checkout ctags in the given path.
     * @param cTagsURL : URL to clone CTags
     * @param checkoutPath : Path in which the CTags folder will be checked out
     */
    public static void checkoutCTags(String cTagsURL, String checkoutPath) {
    	cloneRepo.checkoutRepo(cTagsURL,checkoutPath);
    }
    
}