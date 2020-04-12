package com.vikas.method_parser.version_control_manager.details.fetcher.cmd;

import com.vikas.method_parser.version_control_manager.details.fetcher.model.UserInput;

/**
 * To get user input.
 *
 */
public class CommandLineInterface {
	/**
	 * To get input arguments from the user.
	 * @param args
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
