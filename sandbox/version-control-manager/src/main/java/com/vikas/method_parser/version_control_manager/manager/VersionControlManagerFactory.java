package com.vikas.method_parser.version_control_manager.manager;

public class VersionControlManagerFactory {
    public static VersionControlManager getVersionControlManager(String url){
        // Todo: Specific implementation pending.
        return new GITVersionControlManager();
    }
}
