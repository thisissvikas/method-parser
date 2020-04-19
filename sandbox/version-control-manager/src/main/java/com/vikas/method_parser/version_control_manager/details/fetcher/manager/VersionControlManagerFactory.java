package com.vikas.method_parser.version_control_manager.details.fetcher.manager;

import com.vikas.method_parser.version_control_manager.details.fetcher.model.UserInput;

/**
 * Factory to return the instance of {@link VersionControlManager} based on user input.
 *
 */
public class VersionControlManagerFactory {
    public static VersionControlManager getVersionControlManager(UserInput userInput){
        // Todo: Specific implementation pending.
        return new GITVersionControlManager();
    }
}
