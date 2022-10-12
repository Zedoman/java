package mypro;

class test2{
	int a;
	
	test2(int i){
		a=i;
	}
	
	test2 incrbyten() {
		test2 temp = new test2(a+10);
		return temp;
	}
}

class retob{
	public static void main(String args[]) {
		test2 ob1=new test2(2);
		test2 ob2;
		
		ob2=ob1.incrbyten();
		System.out.println("ob1.a: "+ob1.a);
		System.out.println("ob2.a: "+ob2.a);
		
		ob2=ob2.incrbyten();
		System.out.println("ob2.a after second incr: "+ob2.a);
	}
}