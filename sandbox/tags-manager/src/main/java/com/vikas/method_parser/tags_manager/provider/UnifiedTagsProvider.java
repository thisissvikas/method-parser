package com.vikas.method_parser.tags_manager.provider;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class UnifiedTagsProvider {
  public List<String> getUnifiedTags(String languageFilter, Path pathToSourceCode) {
    // Todo: We have to decide how to do the filtering, that is why not passing the filter to
    // respective providers as of now.
    List<String> tags = new ArrayList<>();
    for (TagsProvider provider : TagsProviderFactory.getAllProviders()) {
      tags.addAll(provider.getTags(languageFilter, pathToSourceCode));
    }
    return getFinalTags(tags);
  }

  private List<String> getFinalTags(List<String> tags) {
    // Todo: This will change if we have more than just U-CTAGS in use.
    return tags;
  }
}
