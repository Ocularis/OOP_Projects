package app;

import java.util.GregorianCalendar;

import administration.Course;
import administration.Department;
import hr.Student;
import inventory.Item;
import inventory.Loan;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department it = new Department("Informasjonsteknologi", "ITD");
		Course oop = new Course("Objektorientert Programmering", "00142", it);
		Item printer = new Item("Prusa 3d Printer", 1, 1);
		Student per = new Student("Per", "Olsen", "+4722225555", it, "0001", oop);
		
		GregorianCalendar date = new GregorianCalendar(2017, 1, 18);
		Loan lPrinter = new Loan(printer, per, date);
		
		System.out.println(lPrinter.getItem().getName()+" Loaned at: "+lPrinter.getLoanDate().getTime());
		
	}

}
