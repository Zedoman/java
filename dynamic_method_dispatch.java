package inheritance;

class A3{
	void callme() {
		System.out.println("Inside A's callme");
	}
}

class B3 extends A3{
	void callme() {
		System.out.println("Inside B's callme");
	}
}

class C2 extends B3{
	void callme() {
		System.out.println("Inside C's callme");
	}
}

class dispatch{
	public static void main(String args[]) {
		A3 a = new A3();
		B3 b = new B3();
		C2 c = new C2();
		
		A3 r; //obtain a reference of type A
		
		r=a;
		r.callme();
		
		r=b;
		r.callme();
		
		r=c;
		r.callme();
	}
}