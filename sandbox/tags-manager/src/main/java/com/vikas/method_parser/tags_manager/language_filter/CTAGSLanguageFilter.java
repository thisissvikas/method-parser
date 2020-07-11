package com.vikas.method_parser.tags_manager.language_filter;

import com.vikas.method_parser.tags_manager.model.Language;

import java.util.List;

public class CTAGSLanguageFilter implements LanguageFilter {
  @Override
  public String createFilter(List<Language> languageList) {
	  String languages = "";
	  for(Language language : languageList) {
		  languages = languages + "," + language.getName();
	  }
    return languages;
  }
}
