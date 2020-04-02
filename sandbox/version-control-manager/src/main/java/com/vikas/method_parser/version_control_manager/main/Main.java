package com.vikas.method_parser.version_control_manager.main;

import com.vikas.method_parser.version_control_manager.cmd.CommandLineInterface;
import com.vikas.method_parser.version_control_manager.manager.VersionControlManager;
import com.vikas.method_parser.version_control_manager.manager.VersionControlManagerFactory;
import com.vikas.method_parser.version_control_manager.model.UserInput;

public class Main {
  public static void main(String[] args) {
    UserInput userInput = CommandLineInterface.getUserInput(args);
    VersionControlManager versionControlManager =
        VersionControlManagerFactory.getVersionControlManager(userInput);
    versionControlManager.getSourceDetail(userInput);
  }
}
