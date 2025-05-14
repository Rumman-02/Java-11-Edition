package SelfLearningByHerbertSchildt.Chapter6.Class;

/*
A program that uses the Box class
call this file BoxDemo.java
 */

class Box{
    double height;
    double width;
    double depth;
}

// This class declares an object of type Box
public class BoxDemo {
    public static void main(String[] args){
        Box myBox=new Box();

        // Assign values to Mybox's instance variables
        myBox.height=10;
        myBox.width=20;
        myBox.depth=15;

        double vol= myBox.height* myBox.width*myBox.depth;
        System.out.println("Volume of the box is:" + vol);
    }
}
