package inheritance;

public class employee extends person {

	

	private String empgrade;
	private int salary;
	private String ctitle;
	private String empname;
	
	
	public employee(String name, String ctitls) {
		super(name);
		this.ctitle=ctitle;
	}
	public String getEmpgrade() {
		return empgrade;
	}
	public void setEmpgrade(String empgrade) {
		this.empgrade = empgrade;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getCtitle() {
		return ctitle;
	}
	
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	public String toString() {
        return super.toString()+" "+ctitle+" "+ empname + " "+empgrade;
    }

}
