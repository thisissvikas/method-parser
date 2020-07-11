package com.vikas.method_parser.tags_manager.language_filter;

import java.util.ArrayList;
import java.util.List;

public class LanguageFilterFactory {
    public static LanguageFilter getLanguageFilter(){
        return new CTAGSLanguageFilter();
    }
    
    public static List<Languages> getLanguageList(List<String> languageList) {
    	List<Languages> languageNames = new ArrayList<Languages>();
    	for(String name : languageList) {
    		name = name.toLowerCase();
    		switch(name) {
    		case "c++" :
    			languageNames.add(Languages.CPP);
    			break;
    		case "c#" :
    			languageNames.add(Languages.CSHARP);
    			break;
    		case "c" :
    			languageNames.add(Languages.C);
    			break;
    		case "java" :
    			languageNames.add(Languages.JAVA);
    			break;
    		case "python" :
    			languageNames.add(Languages.PYTHON);
    			break;
    		case "asp" :
    			languageNames.add(Languages.ASP);
    			break;
    		case "asm" :
    			languageNames.add(Languages.ASM);
    			break;
    		case "awk" :
    			languageNames.add(Languages.AWK);
    			break;
    		case "basic" :
    			languageNames.add(Languages.BASIC);
    			break;
    		case "beta" :
    			languageNames.add(Languages.BETA);
    			break;
    		case "cobol" :
    			languageNames.add(Languages.COBOL);
    			break;
    		case "eiffel" :
    			languageNames.add(Languages.EIFFEL);
    			break;
    		case "erlang" :
    			languageNames.add(Languages.ERLANG);
    			break;
    		case "fortran" :
    			languageNames.add(Languages.FORTRAN);
    			break;
    		case "html" :
    			languageNames.add(Languages.HTML);
    			break;
    		case "lisp" :
    			languageNames.add(Languages.LISP);
    			break;
    		case "lua" :
    			languageNames.add(Languages.LUA);
    			break;
    		case "make" :
    			languageNames.add(Languages.MAKE);
    			break;
    		case "pascal" :
    			languageNames.add(Languages.PASCAL);
    			break;
    		case "perl" :
    			languageNames.add(Languages.PERL);
    			break;
    		case "php" :
    			languageNames.add(Languages.PHP);
    			break;
    		case "rexx" :
    			languageNames.add(Languages.REXX);
    			break;
    		case "ruby" :
    			languageNames.add(Languages.RUBY);
    			break;
    		case "scheme" :
    			languageNames.add(Languages.SCHEME);
    			break;
    		case "slang" :
    			languageNames.add(Languages.SLANG);
    			break;
    		case "sh" :
    			languageNames.add(Languages.SH);
    			break;
    		case "sml" :
    			languageNames.add(Languages.SML);
    			break;
    		case "sql" :
    			languageNames.add(Languages.SQL);
    			break;
    		case "tcl" :
    			languageNames.add(Languages.TCL);
    			break;
    		case "vera" :
    			languageNames.add(Languages.VERA);
    			break;
    		case "verilog" :
    			languageNames.add(Languages.VERILOG);
    			break;
    		case "vim" :
    			languageNames.add(Languages.VIM);
    			break;
    		case "yacc" :
    			languageNames.add(Languages.YACC);
    			break;
			default: 
				break;
    		}
    	}
    	return languageNames;
    }
}
