package staticvar;

class Player1{
	private String name;
	private static int c=0;

	public Player1(String name) {
		super();
		this.name = name;
		c++;
	}

	public static int getC() {
		return c;
	}
	
	
	
}

public class staticmethods {
    
	public static void main(String[] args) {
		Player1 p1=new Player1("Ronaldo");
		System.out.println(Player1.getC());//1st player is created
		
		Player1 p2=new Player1("Messi");
		System.out.println(Player1.getC());//2nd player is created
		

	}

}
