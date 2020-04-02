package com.vikas.method_parser.version_control_manager.manager;

import com.vikas.method_parser.version_control_manager.model.UserInput;

public class VersionControlManagerFactory {
    public static VersionControlManager getVersionControlManager(UserInput userInput){
        // Todo: Specific implementation pending.
        return new GITVersionControlManager();
    }
}
