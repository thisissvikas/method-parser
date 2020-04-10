package com.vikas.method_parser.version_control_manager.details.fetcher.main;

import com.vikas.method_parser.version_control_manager.details.fetcher.cmd.CommandLineInterface;
import com.vikas.method_parser.version_control_manager.details.fetcher.manager.VersionControlManager;
import com.vikas.method_parser.version_control_manager.details.fetcher.manager.VersionControlManagerFactory;
import com.vikas.method_parser.version_control_manager.details.fetcher.model.UserInput;

public class Main {
  public static void main(String[] args) {
    UserInput userInput = CommandLineInterface.getUserInput(args);
    VersionControlManager versionControlManager =
        VersionControlManagerFactory.getVersionControlManager(userInput);
    versionControlManager.getSourceDetail(userInput);
  }
}
