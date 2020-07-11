package com.vikas.method_parser.tags_manager.language_filter;

public enum Languages {
	CPP("C++"),
	CSHARP("C#"),
	C("C"),
	JAVA("Java"),
	JAVASCRIPT("JavaScript"),
	PYTHON("Python"),
	ASM("Asm"),
	ASP("Asp"),
	AWK("Awk"),
	BASIC("Basic"),
	BETA("BETA"),
	COBOL("Cobol"),
	EIFFEL("Eiffel"),
	ERLANG("Erlang"),
	FORTRAN("Fortran"),
	HTML("HTML"),
	LISP("Lisp"),
	LUA("Lua"),
	MAKE("Make"),
	PASCAL("Pascal"),
	PERL("Perl"),
	PHP("PHP"),
	REXX("REXX"),
	RUBY("Ruby"),
	SCHEME("Scheme"),
	SH("Sh"),
	SLANG("SLang"),
	SML("SML"),
	SQL("SQL"),
	TCL("Tcl"),
	VERA("Vera"),
	VERILOG("Verilog"),
	VIM("Vim"),
	YACC("YACC");
	
	private String name;
	private Languages(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}