package exceptionhandling;

public class exc2 {

	public static void main(String[] args) {
		int d,a;
		
		try {
			//d=10;
			d=0;
			a=10/d;
			System.out.println(a);
		}
		catch(Exception e){
			System.out.println("Div by zero");
		}

	}

}
