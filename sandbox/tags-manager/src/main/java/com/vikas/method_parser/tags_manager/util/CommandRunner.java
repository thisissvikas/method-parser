package com.vikas.method_parser.tags_manager.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CommandRunner {
  public List<String> runCommand(String command) throws IOException {
    ProcessBuilder builder = new ProcessBuilder(command.split(" "));
    builder.redirectErrorStream(true);
    Process process = builder.start();
    BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
    String line;
    List<String> commandOutputLines = new ArrayList<>();
    while ((line = br.readLine()) != null) {
      commandOutputLines.add(line);
    }
    return commandOutputLines;
  }
}
