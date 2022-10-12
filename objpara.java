package mypro;

class test{
	int a,b;
	
	test(int i, int j){
		a=i;
		b=j;
	}
	
	boolean equalTo(test o) {
		if(o.a == a && o.b==b) return true;
		else return false;
	}
}
class passob{
	public static void main(String args[]) {
		test ob1=new test(100,22);
		test ob2=new test(100,22);
		test ob3=new test(-1,66);
		
		System.out.println("ob1==ob2: "+ob1.equalTo(ob2));
		System.out.println("ob1==ob3: "+ob1.equalTo(ob3));
	}
}