package com.vikas.method_parser.tags_manager.generator;

import com.vikas.method_parser.tags_manager.language_filter.LanguageFilter;
import com.vikas.method_parser.tags_manager.language_filter.LanguageFilterFactory;
import com.vikas.method_parser.tags_manager.model.Language;
import com.vikas.method_parser.tags_manager.provider.UnifiedTagsProvider;

import java.nio.file.Path;
import java.util.List;

public class TagsGeneratorImpl implements TagsGenerator{
    public List<Tag> generateTags(Path pathToSourceCode, List<Language> languages) {
        LanguageFilter languageFilter = LanguageFilterFactory.getLanguageFilter();
        String languageFilterCommand = languageFilter.createFilter(languages);
        UnifiedTagsProvider unifiedTagsProvider = new UnifiedTagsProvider();
        unifiedTagsProvider.getUnifiedTags(languageFilterCommand, pathToSourceCode);
        return null;
    }
}
