package mypro;
import java.util.*;
class box4{
	double width;
	double height;
	double depth;
	
	box4(double w, double h, double d){
		width=w;
		height=h;
		depth=d;
	}	
	double volume() {
		return width*height*depth;
	}
}
class boxdemo8{
	public static void main(String args[]) {
		double w,h,d;
		System.out.println("Constructing box");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Width: ");
		w=sc.nextDouble();
		System.out.println("Enter height: ");
		h=sc.nextDouble();
		System.out.println("Enter depth: ");
		d=sc.nextDouble();
		
		box4 mybox=new box4(w,h,d);
		box4 mybox2=new box4(w,h,d);
		
		double vol;
		
		 vol=mybox.volume();
	     System.out.println("Vol of box1: "+vol);
	        
	     vol=mybox2.volume();
	     System.out.println("Vol of box2: "+vol);
	}
}