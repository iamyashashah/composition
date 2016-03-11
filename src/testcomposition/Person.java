package testcomposition;

import java.util.Scanner;


public class Person {
	
	private Job job;
	private Education edu;
	static String School;


public Person()
{
	Scanner sc = new Scanner (System.in);
	
	this.job=new Job();
	this.edu=new Education();
	
	job.setSalary(1000L);
	job.setId(123);
	
	System.out.println("Enter the school");
	School = sc.nextLine();
	edu.setUniversityName(School);
	int years = sc.nextInt();
	edu.setNoofYears(years);
	
	
}
public long getSalary()
{
	return job.getSalary();
}

public int getId()
{
	return job.getId();
}

public int getNoofYears()
{
	return edu.getNoofYears();
}
public String getUniversityName()
{
	return edu.getUniversityName();
}
	
	public String toString()
	{
		return getSalary() +" "+ getId() + " " + getUniversityName() + " " + getNoofYears();
	}

}
