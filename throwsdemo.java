package exceptionhandling;

public class throwsdemo {
	static void throwone() throws NullPointerException {
		System.out.println("Inside throwone.");
		throw new NullPointerException("demo");
	}
	
	/*public static void main(String args[]) throws NullPointerException {
		throwone();
	}*/ //we can do it  in these or use try catch
	public static void main(String args[]) {
		try {
			throwone();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
