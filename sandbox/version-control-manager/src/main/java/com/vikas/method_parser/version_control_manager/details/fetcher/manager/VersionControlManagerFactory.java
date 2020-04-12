package com.vikas.method_parser.version_control_manager.details.fetcher.manager;

import com.vikas.method_parser.version_control_manager.details.fetcher.model.UserInput;

/**
 * Factory class to return the instance of {@link VersionControlManager}
 *
 */
public class VersionControlManagerFactory {
    public static VersionControlManager getVersionControlManager(UserInput userInput){
        // Todo: Specific implementation pending.
        return new GITVersionControlManager();
    }
}
