package com.vikas.method_parser.version_control_manager.main;

import com.vikas.method_parser.version_control_manager.cmd.CommandLineInterface;
import com.vikas.method_parser.version_control_manager.manager.VersionControlManager;
import com.vikas.method_parser.version_control_manager.manager.VersionControlManagerFactory;

public class Main {
  public static void main(String[] args) {
    // Todo: This is supposed to manage command line interactions and give us the url / list of urls to work on.
    CommandLineInterface commandLineInterface = new CommandLineInterface();
    String hardcodedURL = "";
    VersionControlManager versionControlManager = VersionControlManagerFactory.getVersionControlManager(hardcodedURL);
    versionControlManager.getSourceDetail(hardcodedURL);
  }
}
