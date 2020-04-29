package com.vikas.method_parser.tags_manager.language_filter;

import java.util.ArrayList;
import java.util.List;

public class LanguageFilterFactory {
    public static LanguageFilter getLanguageFilter(){
        return new CTAGSLanguageFilter();
    }
    
    public static List<LanguageNames> getLanguages(List<String> languageList) {
		List<LanguageNames> languageListForCTags = new ArrayList<LanguageNames>();
		LanguageNames name = getLanguageName(languageList);
		if (name != null) {
			try {
				switch (name) {
				case JAVA:
					if (languageList.contains(name.name())) {
						languageListForCTags.add(name);
					}
					break;
				case CPP:
					if (languageList.contains(name.name())) {
						languageListForCTags.add(name);
					}
					break;
				case CSHARP:
					if (languageList.contains(name.name())) {
						 languageListForCTags.add(name);
					}
					break;
				case C:
					if (languageList.contains(name.name())) {
						languageListForCTags.add(name);
					}
					break;
				case PYTHON:
					if (languageList.contains(name.name())) {
						 languageListForCTags.add(name);
					}
					break;
				case JAVASCRIPT:
					if (languageList.contains(name.name())) {
						languageListForCTags.add(name);
					}
				default:
					break;
				}
			} catch (IllegalArgumentException e) {
				//Implement logger logic here
			}
		}
		return languageListForCTags;
	}

	private static LanguageNames getLanguageName(List<String> languages) {
		for(String language : languages) {
			language = language.toLowerCase();
			if (language.equals("c++") || language.equals("cplusplus") || language.equals("c plus plus")) {
				return LanguageNames.CPP;
			} else if (language.equals("c#") || language.equals("csharp") || language.contentEquals("c sharp")) { // $NON-NLS-1$
				return LanguageNames.CSHARP;
			} else if (language.equals("c")) { // $NON-NLS-1$
				return LanguageNames.C;
			} else if (language.equals("java")) { // $NON-NLS-1$
				return LanguageNames.JAVA;
			} else if (language.equals("javascript")) { // $NON-NLS-1$
				return LanguageNames.JAVASCRIPT;
			} else if (language.equals("python")) { // $NON-NLS-1$
				return LanguageNames.PYTHON;
			} else if (language.equals("asm") || language.equals("assembly language") || language.equals("assembly")) { // $NON-NLS-1$
				return LanguageNames.ASM;
			}
		}
		return null;
	}
}
