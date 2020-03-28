package com.vikas.method_parser.version_control_manager.main;

import com.vikas.method_parser.version_control_manager.cmd.CommandLineInterface;
import com.vikas.method_parser.version_control_manager.manager.VersionControlManager;
import com.vikas.method_parser.version_control_manager.manager.VersionControlManagerFactory;

public class Main {
  public static void main(String[] args) {
    String url = CommandLineInterface.getURL(args);
    VersionControlManager versionControlManager =
        VersionControlManagerFactory.getVersionControlManager(url);
    versionControlManager.getSourceDetail(url);
  }
}
