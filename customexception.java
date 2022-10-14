package exceptionhandling;

class amount{
	private String curr;
	private int amt;
	//constructor
	public amount(String curr, int amt) {
		super();
		this.curr = curr;
		this.amt = amt;
	}
	
	public void add(amount that)throws CurrenciesDonotMatch{
		if(!this.curr.equals(that.curr)) {
			throw new CurrenciesDonotMatch("Currency donot match "+this.curr+" & "+that.curr);
		}
		this.amt+=that.amt;
	}
	
	public String toString() {
		return amt+" "+curr;
	}
	
}

class CurrenciesDonotMatch extends Exception {
	CurrenciesDonotMatch(String msg){
		super(msg);
	}
	
}

public class customexception {
         public static void main(String[] a) throws CurrenciesDonotMatch {
        	 amount a1=new amount("EUR",10);
        	 amount a2=new amount("EUR",20);
        	 a1.add(a2);
        	 System.out.println(a1);
         }
}
