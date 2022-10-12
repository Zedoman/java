package staticvar;

class Player{
	private String name;
	private static int c=0;

	public Player(String name) {
		super();
		this.name = name;
		c++;
	}

	public static int getC() {
		return c;
	}
	
	
	
}

public class staticvar {
    
	public static void main(String[] args) {
		Player p1=new Player("Ronaldo");
		System.out.println(p1.getC());//1st player is created
		
		Player p2=new Player("Messi");
		System.out.println(p2.getC());//2nd player is created
		

	}

}
