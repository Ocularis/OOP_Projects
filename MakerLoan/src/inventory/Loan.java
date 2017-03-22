package inventory;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;

import hr.Person;

public class Loan implements Comparable<Loan> {
	private Item item; 
	private Person person; 
	private GregorianCalendar loanDate;
	
	private static ArrayList<Loan> loans = new ArrayList<>();
	
	public Loan(Item item, Person person, GregorianCalendar loanDate) {
		this.item = item;
		this.person = person;
		this.loanDate = loanDate;
		
		loans.add(this);
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public GregorianCalendar getLoanDate() {
		return loanDate;
	}

	public void setLoanDate(GregorianCalendar loanDate) {
		this.loanDate = loanDate;
	}
	
	public static ArrayList<Loan> getLoans() {
		return loans;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return item.getName() + " " + person + " [" + loanDate.getTime() + "]";
	}

	@Override
    public int compareTo(Loan l) {
        return Comparators.NAME.compare(this, l);
    }


    public static class Comparators {

        public static Comparator<Loan> AGEDESC = new Comparator<Loan>() {
            @Override
            public int compare(Loan l1, Loan l2) {
                return l1.loanDate.compareTo(l2.loanDate);
            }
        };
        public static Comparator<Loan> AGEASC = new Comparator<Loan>() {
            @Override
            public int compare(Loan l1, Loan l2) {
                return l1.loanDate.compareTo(l2.loanDate)*-1;
            }
        };
        public static Comparator<Loan> NAME = new Comparator<Loan>() {
            @Override
            public int compare(Loan l1, Loan l2) {
                return l1.person.getSurName().compareTo(l2.person.getSurName());
            }
        };
    }
	
}

