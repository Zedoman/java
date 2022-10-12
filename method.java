package mypro;

class box2{
    double width;
    double height;
    double depth;
}
class boxdemo3 {
    public static void main(String args[]){
        box2 mybox = new box2();
        box2 mybox2 = new box2();
        double vol;

        mybox.width=15;
        mybox.height=30;
        mybox.depth=20;

        mybox2.width=60;
        mybox2.height=50;
        mybox2.depth=40;
         
        vol= mybox.width*mybox.height*mybox.depth;

        System.out.println("Vol of box1: "+vol);
        
        vol= mybox2.width*mybox2.height*mybox2.depth;

        System.out.println("Vol of box2: "+vol);
    }
    
}