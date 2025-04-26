package SelfLearningByHerbertSchildt.Chpater6.ParameterConstructor;

/*
    Here Box uses parameterized constructor to
    initialize the dimension of the Box
 */

class Box{
    double height;
    double width;
    double depth;

    // This is the constructor for the "Box"
    Box(double w, double h, double d){
        height=w; // "This" represents the current object
        width=h;
        depth=d;
    }

    // Compute the volume of the box
    double volume(){
        return height*width*depth;
    }
}

public class BoxDemo7 {
    public static void main(String[ ] args){

        // declare, allocate and initialize the BOx objects
        Box myBox1=new Box(10,20,15);
        Box myBox2=new Box(3,6,9);

        System.out.println("\nVolume of first box: "+myBox1.volume());
        System.out.println("Volume of second Box: "+myBox2.volume());
    }
}
