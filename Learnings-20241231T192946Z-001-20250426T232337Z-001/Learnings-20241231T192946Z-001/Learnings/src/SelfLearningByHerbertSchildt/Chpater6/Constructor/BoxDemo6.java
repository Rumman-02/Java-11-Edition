package SelfLearningByHerbertSchildt.Chapter6.Constructor;

/*
    Here, Box uses a constructor to initialize the
    dimensions of Box
 */

class Box{
    double height;
    double width;
    double depth;

    // This is the constructor of Box
    Box(){
        System.out.println("Constructing Box");
        height = 10;
        width = 10;
        depth = 10;
    }

    // Compute and return the values
    double volume(){
        return height* width* depth;
    }
}

public class BoxDemo6 {
    public static void main(String[] args){

        Box myBox1=new Box(); // new Box is calling the "Box()" Constructor

        Box myBox2=new Box();  // new Box is calling the "Box()" Constructor

        //get the volume of first Box
        double volume1=myBox1.volume();
        System.out.println("Volume of the first Box: "+volume1);

        //get the volume of second box
        double volume2= myBox2.volume();
        System.out.println("Volume of second Box: "+volume2);
    }
}
