package com.vikas.method_parser.tags_manager.language_filter;

import java.util.ArrayList;
import java.util.List;

public class LanguageFilterFactory {
    public static LanguageFilter getLanguageFilter(){
        return new CTAGSLanguageFilter();
    }
    
    public static List<Languages> getLanguages(List<String> languageList) {
		List<Languages> languageListForCTags = new ArrayList<Languages>();
		Languages name = getLanguageName(languageList);
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

	private static Languages getLanguageName(List<String> languages) {
		for(String language : languages) {
			language = language.toLowerCase();
			if (language.equals("c++") || language.equals("cpp")) {
				return Languages.CPP;
			} else if (language.equals("c#") || language.equals("csharp") || language.contentEquals("cs")) { // $NON-NLS-1$
				return Languages.CSHARP;
			} else if (language.equals("c")) { // $NON-NLS-1$
				return Languages.C;
			} else if (language.equals("java")) { // $NON-NLS-1$
				return Languages.JAVA;
			} else if (language.equals("javascript")) { // $NON-NLS-1$
				return Languages.JAVASCRIPT;
			} else if (language.equals("python") || language.contentEquals("py")) { // $NON-NLS-1$
				return Languages.PYTHON;
			} else if (language.equals("asm") || language.equals("assembly language") || language.equals("assembly")) { // $NON-NLS-1$
				return Languages.ASM;
			}
		}
		return null;
	}
}
