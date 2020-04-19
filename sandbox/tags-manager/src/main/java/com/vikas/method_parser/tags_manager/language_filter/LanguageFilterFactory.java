package com.vikas.method_parser.tags_manager.language_filter;

public class LanguageFilterFactory {
    public static LanguageFilter getLanguageFilter(){
        return new CTAGSLanguageFilter();
    }
}
