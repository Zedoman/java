package staticvar;

class defaultclass{
	
}

public class nestedclass {
	
	int i;
	class innerclass{
		public void method() {
			i=5;
		}
	}
	
	static class staticnestedclass{
		public void method() {
			//i=5;//error- Cannot make a static reference to the non-static field i
		}
	}

	public static void main(String[] args) {
	    //innerclass i = new innerclass(); //error- No enclosing instance of type nestedclass is accessible
		staticnestedclass s = new staticnestedclass();
		
		nestedclass n = new nestedclass();
		innerclass i = n.new innerclass();
		

	}

}
