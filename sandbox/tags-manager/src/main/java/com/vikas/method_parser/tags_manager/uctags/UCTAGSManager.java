package com.vikas.method_parser.tags_manager.uctags;

import com.vikas.method_parser.tags_manager.util.CloneGitRepository;
import com.vikas.method_parser.tags_manager.util.PathOperationManager;

public class UCTAGSManager {
    public static String setup() {
        checkoutCTags("", PathOperationManager.getTemporaryFileDirectory().toString());
        return "";
    }

    /**
     * To checkout ctags in the given path.
     * @param cTagsURL : URL to clone CTags
     * @param checkoutPath : Path in which the CTags folder will be checked out
     */
    private static void checkoutCTags(String cTagsURL, String checkoutPath) {
        CloneGitRepository.checkoutRepo(cTagsURL, checkoutPath);
    }
}
