package inheritance;

public class recipe1 extends abstractrecipe {

	@Override
	void getready() {
		System.out.println("Get the raw material");
		System.out.println("Get the utensils");
	}

	@Override
	void dothedish() {
		System.out.println("do the dish");
		
	}

	@Override
	void cleanup() {
		System.out.println("clean the utensils");
		
	}

	

}
