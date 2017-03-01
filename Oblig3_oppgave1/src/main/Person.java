package main;

public class Person {
	private String fnavn; 
	private String enavn;
	private Person bestevenn;
	
	public Person(String fnavn, String enavn) {
		this.fnavn = fnavn;
		this.enavn = enavn;
	}
	
	public void setFnavn(String fnavn) {
		this.fnavn = fnavn;
	}
	
	public String getFnavn() {
		return this.fnavn;
	}
	
	public void setEnavn(String fnavn) {
		this.fnavn = enavn;
	}
	
	public String getEnavn() {
		return this.enavn;
	}
	
	public void setBestevenn(Person bestevenn) {
		this.bestevenn = bestevenn;
	}
	
	public Person getBestevenn() {
		return this.bestevenn;
	}
	
	
}
