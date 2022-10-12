package mypro;

//difference between public and private
class test3{
	int a;
	public int b;
	private int c;
	
	//methods to access c
	void setc(int i){
		c=i;
	}
	int getc() {
		return c;
	}
}

class accesstest{
	public static void main(String args[]) {
		test3 ob=new test3();
		
		//a and b can be accessed directly
		ob.a=10;
		ob.b=100;
		
		//c cant be access directly
		//ob.c=9 cause error
		
		//c can access through its method
		ob.setc(1000);
		System.out.println("a: "+ob.a+" "+"b: "+ob.b+" "+"c: "+ob.getc());
	}
}
