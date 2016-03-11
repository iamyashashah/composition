package testcomposition;

public class Education {
	
	private String UniversityName;
	private int NoofYears;
	
	public Education()
	{
		
	}

	public int getNoofYears() {
		return NoofYears;
	}

	public void setNoofYears(int noofYears) {
		NoofYears = noofYears;
	}

	public String getUniversityName() {
		return UniversityName;
	}

	public void setUniversityName(String universityName) {
		UniversityName = universityName;
	}
	
	public String toString()
	{
		return UniversityName;
		
	}
	

}
