package com.vikas.method_parser.tags_manager.uctags;

import com.vikas.method_parser.tags_manager.util.CommandRunner;
import com.vikas.method_parser.tags_manager.util.Constants;

import java.io.*;

public class TagGenerator {

  public static String generateTags(String commandToGenerateTags, String tempLocation) {
    try {
      new CommandRunner().runCommand(commandToGenerateTags);
      File file = new File(tempLocation + "\\" + Constants.CHECKOUT_FOLDER);

      BufferedReader br;
      br = new BufferedReader(new FileReader(file));

      String st;
      StringBuilder tags = new StringBuilder();
      while ((st = br.readLine()) != null) {
        tags.append(st);
      }
      return tags.toString();
    } catch (IOException | InterruptedException e) {
      return "";
    }
  }
}
