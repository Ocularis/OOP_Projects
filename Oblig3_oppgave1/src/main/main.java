package main;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person per = new Person("Per", "Olsen");
		Person ole = new Person("Ole", "Hansen");
		
		per.setBestevenn(ole);
		ole.setBestevenn(per);
		
		

		System.out.println(ole.getFnavn()+" "+ole.getEnavn()+" er bestevenn med "+ole.getBestevenn().getFnavn()+" "+ole.getBestevenn().getEnavn());
		System.out.println(per.getFnavn()+" "+per.getEnavn()+" er bestevenn med "+per.getBestevenn().getFnavn()+" "+per.getBestevenn().getEnavn());
	}

}
