package inheritance;

public class studentRunner {

	public static void main(String args[]) {
		student s= new student("Ranga", "VIT");
		
		s.setEmail("dfg@gmail.com");
		s.setYear(4);
		String value = s.toString();
		System.out.println(value);
	}
}
