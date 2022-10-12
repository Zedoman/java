package mypro;

/*here box defines three constructor overload to initialise the dim of box in various ways*/
import java.util.*;
class box5{
	double width;
	double height;
	double depth;
	
	box5(double w, double h, double d){
		width=w;
		height=h;
		depth=d;
	}	
	
	//constructor when no dimension specified
	box5(){
		width=-1;
		height=-1;
		depth=-1;
	}
	
	//constructor when cube is created
	box5(double len){
		width=height=depth=len;
	}
	
	double volume() {
		return width*height*depth;
	}
}
class boxdemo9{
	public static void main(String args[]) {
		double w,h,d,l;
		System.out.println("Constructing box");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Width: ");
		w=sc.nextDouble();
		System.out.println("Enter height: ");
		h=sc.nextDouble();
		System.out.println("Enter depth: ");
		d=sc.nextDouble();
		System.out.println("Enter len: ");
		l=sc.nextDouble();
		
		box5 mybox=new box5(w,h,d);
		box5 mybox2=new box5();
		box5 mycube=new box5(l);
		
		double vol;
		
		 vol=mybox.volume();
	     System.out.println("Vol of box1: "+vol);
	        
	     vol=mybox2.volume();
	     System.out.println("Vol of box2: "+vol);
	     
	     vol=mycube.volume();
	     System.out.println("Vol of box3: "+vol);
	}
}