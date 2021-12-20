package com.vikas.method_parser.tags_manager.uctags;

import com.vikas.method_parser.tags_manager.util.CommandRunner;

import java.io.*;
import java.util.Collections;
import java.util.List;

public class TagGenerator {

  public static List<String> generateTags(String commandToGenerateTags) {
    try {
      return new CommandRunner().runCommand(commandToGenerateTags);
    } catch (IOException e) {
      return Collections.emptyList();
    }
  }
}
