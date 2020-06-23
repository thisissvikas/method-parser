package com.vikas.method_parser.tags_manager.language_filter;

import com.vikas.method_parser.tags_manager.model.Language;

import java.util.List;

public interface LanguageFilter {
    String createFilter(List<Language> languages);
}
