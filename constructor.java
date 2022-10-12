package mypro;
import java.util.*;
class box3{
	double width;
	double height;
	double depth;
	
	box3(){
		System.out.println("Constructing box");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Width: ");
		width=sc.nextDouble();
		System.out.println("Enter height: ");
		height=sc.nextDouble();
		System.out.println("Enter depth: ");
		depth=sc.nextDouble();
		}
	double volume() {
		return width*height*depth;
	}
}
class boxdemo6{
	public static void main(String args[]) {
		box3 mybox=new box3();
		box3 mybox2=new box3();
		
		double vol;
		
		 vol=mybox.volume();
	     System.out.println("Vol of box1: "+vol);
	        
	     vol=mybox2.volume();
	     System.out.println("Vol of box2: "+vol);
	}
}