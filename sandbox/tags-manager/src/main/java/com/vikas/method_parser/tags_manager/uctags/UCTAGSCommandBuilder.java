package com.vikas.method_parser.tags_manager.uctags;

import java.nio.file.Path;

public class UCTAGSCommandBuilder {
  public static String getCommand(String pathToUCTAGS, String languageFilter, Path pathToSourceCode) {
	String command = pathToUCTAGS + " -R --fields=+lnS-kftm --languages=" + languageFilter + " " + pathToSourceCode;
    return command;
  }
}
