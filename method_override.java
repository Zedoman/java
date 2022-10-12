package inheritance;

class A1{
	int i,j;
	A1(int a, int b){
		a=i;
		b=j;
	}
	
	void show() {
		System.out.println("i and j:"+i+" "+j);
	}
}

class B1 extends A1{
	int k;
	B1(int a, int b, int c){
		super(a,b);
		k=c;
	}
	
	void show() {
		System.out.println("k:"+k);
	}
}

class override{
	public static void main(String args[]) {
		B1 b = new B1(1,2,3);
		
		b.show();
	}
}