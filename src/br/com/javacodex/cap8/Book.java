//Figura 8.10 - Declarando um tipo ENUM com um construtor e campos de instância explícitos
// e métodos de acesso para esses campos.

package br.com.javacodex.cap8;

public enum Book {
	
	JHTP("Java How to Program", "2015"),
	CHTP("C how to Program", "2013"),
	IW3HTP("Internet & world Wide Web How to Program", "2012"),
	CPPHTP("C++ How to Program", "2014"),
	VBHTP("Visual Basic How to Program", "2014"),
	CSHARPHTP("Visual C# How to Program", "2014");
	
	private final String title;
	private final String copyrightYear;
	
	Book(String title, String copyrightYear){
		this.title = title;
		this.copyrightYear = copyrightYear;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getCopyrightYear() {
		return copyrightYear;
	}
}
