package com.vikas.method_parser.tags_manager.provider;

import com.vikas.method_parser.tags_manager.uctags.UCTAGSCommandBuilder;
import com.vikas.method_parser.tags_manager.uctags.UCTAGSManager;
import com.vikas.method_parser.tags_manager.uctags.TagGenerator;

import java.nio.file.Path;
import java.util.List;

public class UCTAGSProvider implements TagsProvider {

  @Override
  public List<String> getTags(String languageFilter, Path pathToSourceCode) {
    String pathToUCTAGS = UCTAGSManager.setup();
    String commandToGenerateTags =
        UCTAGSCommandBuilder.getCommand(pathToUCTAGS, languageFilter, pathToSourceCode);
    return TagGenerator.generateTags(commandToGenerateTags);
  }
}
