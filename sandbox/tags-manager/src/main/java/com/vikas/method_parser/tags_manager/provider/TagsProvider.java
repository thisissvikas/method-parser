package com.vikas.method_parser.tags_manager.provider;

import java.nio.file.Path;
import java.util.List;

public interface TagsProvider {
  List<String> getTags(String languageFilter, Path pathToSourceCode);
}
