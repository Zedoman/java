package mypro;

class box{
    double width;
    double height;
    double depth;
}
class boxdemo2 {
    public static void main(String args[]){
        box mybox = new box();
        box mybox2 = new box();
        double vol;

        mybox.width=10;
        mybox.height=20;
        mybox.depth=30;

        mybox2.width=60;
        mybox2.height=50;
        mybox2.depth=40;
         
        vol= mybox.width*mybox.height*mybox.depth;

        System.out.println("Vol of box1: "+vol);
        
        vol= mybox2.width*mybox2.height*mybox2.depth;

        System.out.println("Vol of box2: "+vol);
    }
    
}