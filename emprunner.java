package inheritance;

public class emprunner {

	public static void main(String args[]) {
		employee e= new employee("Ranga", "Programmer");
		

		e.setEmpgrade("A");
		e.setEmpname("Avra");
		
		String value = e.toString();
		
		System.out.println(value);
		System.out.println(e);
	}

}
