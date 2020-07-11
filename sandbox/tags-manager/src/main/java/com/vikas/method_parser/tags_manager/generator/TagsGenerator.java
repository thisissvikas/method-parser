package com.vikas.method_parser.tags_manager.generator;

import com.vikas.method_parser.tags_manager.model.Language;

import java.nio.file.Path;
import java.util.List;

public interface TagsGenerator {
    List<String> generateTags(Path pathToSourceCode, List<Language> languages);
}
