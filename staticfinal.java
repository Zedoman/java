package staticvar;

public class staticfinal {
	
	public static final int Sec_in_mins=60;
	public static final int Mins_in_hour=60;
	public static final int Hours_in_day=24;
	public static final int Sec_in_day=Sec_in_mins*Mins_in_hour*Hours_in_day;

	public static void main(String args[]) {
		System.out.print(Sec_in_day);
		
	}

}
