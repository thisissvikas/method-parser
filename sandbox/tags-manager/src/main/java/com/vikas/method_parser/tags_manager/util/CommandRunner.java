package com.vikas.method_parser.tags_manager.util;

import java.io.IOException;

public class CommandRunner {
  public void runCommand(String command) throws IOException, InterruptedException {
    ProcessBuilder builder = new ProcessBuilder(command.split(" "));
    builder.redirectErrorStream(true);
    Process process = builder.start();
    process.waitFor();
  }
}
