package com.vikas.method_parser.version_control_manager.details.fetcher.cmd;

import com.vikas.method_parser.version_control_manager.details.fetcher.model.UserInput;

public class CommandLineInterface {
  public static UserInput getUserInput(String[] args) {
    UserInput userInput = new UserInput();
    userInput.setUserName("krvikas1011");
    userInput.setOrganization("Vikas-Open-Source");
    userInput.setRepositoryName("method-parser");
    return userInput;
  }
}
