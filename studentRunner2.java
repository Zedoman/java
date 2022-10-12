package inheritance;

public class studentRunner2 {

	public static void main(String args[]) {
		person p= new person("Ranga");

		p.setEmail("kj@gmail.com");
		p.setPhoneNumber("76576576575");
		
		String value = p.toString();
		
		System.out.println(value);
		System.out.println(p);
	}

}
