package testcomposition;

import java.util.Scanner;

public class TestPerson {


	public static void main(String[] args) {
		Person person = new Person();
		long salary = person.getSalary();
		int id = person.getId();
		int years = person.getNoofYears();
		

		Scanner sc = new Scanner (System.in);
	
		
		

		String university = person.getUniversityName();
		System.out.println(salary);
		System.out.println(id);
		System.out.println(person.toString());

	}

}
