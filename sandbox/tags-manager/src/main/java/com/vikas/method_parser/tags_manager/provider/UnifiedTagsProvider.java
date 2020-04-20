package com.vikas.method_parser.tags_manager.provider;

import com.vikas.method_parser.tags_manager.language_filter.LanguageFilter;
import com.vikas.method_parser.tags_manager.model.Tag;

import java.util.ArrayList;
import java.util.List;

public class UnifiedTagsProvider {
  public List<Tag> getUnifiedTags(LanguageFilter languageFilter) {
    // Todo: We have to decide how to do the filtering, that is why not passing the filter to
    // respective providers as of now.
    List<Tag> tags = new ArrayList<>();
    for (TagsProvider provider : TagsProviderFactory.getAllProviders()) {
      tags.addAll(provider.getTags());
    }
    return getFinalTags(tags);
  }

  private List<Tag> getFinalTags(List<Tag> tags) {
    return null;
  }
}
