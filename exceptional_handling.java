package exceptionhandling;

public class exceptional_handling {
	public static void main(String args[]) {
		method1();
		System.out.println("main end");
	}
	
	private static void method1() {
		method2();
		System.out.println("Method1 ended");
	}
	
	private static void method2() {
		System.out.println("This is the error");
		try {
			String str=null;
			str.length();
			System.out.println("Inside try");
		}catch(Exception e) {
			
			e.printStackTrace();
		}
	}

}