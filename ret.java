package mypro;

class box1{
	double width;
	double height;
	double depth;
	
	//compute and return vol
	double volume() {
		return width*height*depth;
	}
}
class BOXDEMO4{
	public static void main(String args[]) {
		box1 mybox = new box1();
        box1 mybox2 = new box1();
        double vol;

        mybox.width=20;
        mybox.height=90;
        mybox.depth=35;

        mybox2.width=67;
        mybox2.height=59;
        mybox2.depth=4;
        
        vol=mybox.volume();
        System.out.println("Vol of box1: "+vol);
        
        vol=mybox2.volume();
        System.out.println("Vol of box2: "+vol);
        
        
	}
}