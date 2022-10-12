package mypro;

class overloaddemo{
	void test() {
		System.out.println("no parameters ");
	}
	
	void test(int a) {
		System.out.println("a: "+a);
	}
	
	
	//overload tst for 2 int parameters.
	void test(int a, int b) {
		System.out.println("a: "+a + "b: "+b);
	}
	
	//overload tst for double parameters.
	double test(double a) {
           System.out.println("double a: "+a);
           return a*a;
	}
}

class overload{
	public static void main(String args[]) {
		overloaddemo ob= new overloaddemo();
		double result;
		
		ob.test();
		ob.test(10);
		ob.test(10, 20);
		result=ob.test(123.25);
		System.out.println("result is: "+result);
	}
}