package SelfLearningByHerbertSchildt.Chpater6.This.InstanceVarHide;

/*
    Here Box uses parameterized constructor to
    initialize the dimension of the Box
 */

class Box{
    double height;
    double width;
    double depth;

    // This is the constructor for the "Box"
    Box(double height, double width, double depth){
        /*
        this indicates the class instances
        (form Box class)
         */

        this.height=height; // "This" represents the current object
        this.width=width;
        this.depth=depth;
    }

    // Compute the volume of the box
    double volume(){
        return height*width*depth;
    }
}

public class BoxDemoThis1 {
    public static void main(String[ ] args){

        // declare, allocate and initialize the BOx objects
        Box myBox1=new Box(10,20,15);
        Box myBox2=new Box(3,6,9);

        System.out.println("\nVolume of first box: "+myBox1.volume());
        System.out.println("Volume of second Box: "+myBox2.volume());
    }
}
