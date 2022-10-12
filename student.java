package inheritance;

public class student extends person {

	private String collegeName;
	private int year;
	
	
	
	public student(String name, String collegeName) {
		super(name);
		this.collegeName = collegeName;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	public String toString() {
        return super.getName() +" " + collegeName +" "+ year;
    }

}
