package inheritance;

class A2{
	int i,j;
	A2(int a, int b){
		a=i;
		b=j;
	}
	
	void show() {
		System.out.println("i and j:"+i+" "+j);
	}
}

class B2 extends A2{
	int k;
	B2(int a, int b, int c){
		super(a,b);
		k=c;
	}
	
	void show(String msg) {
		System.out.println(msg+k);
	}
}

class overload{
	public static void main(String args[]) {
		B2 b = new B2(1,2,3);
		
		b.show("hey: ");//show in b
		b.show();//show in a
		
	}
}