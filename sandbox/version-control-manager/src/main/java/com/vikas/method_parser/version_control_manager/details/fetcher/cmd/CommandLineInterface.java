package com.vikas.method_parser.version_control_manager.details.fetcher.cmd;

import com.vikas.method_parser.version_control_manager.details.fetcher.model.UserInput;

/**
 * Used to handle all the command line interactions.
 *
 */
public class CommandLineInterface {
	
  /**
   * Used to get user input from command line.
   * @param args : input like username, organization name and repository name.
   * @return user input data.
   */
  public static UserInput getUserInput(String[] args) {
    UserInput userInput = new UserInput();
    userInput.setUserName("krvikas1011");
    userInput.setOrganization("Vikas-Open-Source");
    userInput.setRepositoryName("method-parser");
    return userInput;
  }
}
