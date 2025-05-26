package SelfLearningByHerbertSchildt.Chapter8.ConstructorObject;

// This program uses inheritance to extend the Box7
class Box8 {
    double height;
    double width;
    double depth;

    Box8(Box8 ob){
        height=ob.height;
        width=ob.width;
        depth=ob.depth;
    }

    Box8(double h, double w, double d){
        height=h;
        width=w;
        depth=d;
    }

    // In case the box is cubed
    Box8(double len){
        height=width=depth=len;
    }

    // when the dimension of the box is not specified, so we will put a default value
    Box8(){
        height=-1;
        width=-1;
        depth=-1;
    }

    // Now calculate and return the volume of the box
    double volume(){
        return height*width*depth;
    }
}

class BoxWeight extends Box8 {
    double weight;

    BoxWeight(double a, double b, double c, double d){
        height=a;
        width=b;
        depth=c;
        weight=d;
    }
}

public class DemoBoxWeight {
    public static void main(String[] args){
        Box8 m1=new Box8(); // Calling the empty one
        System.out.println("Volume of  default one: "+m1.volume());

        Box8 m2=new Box8(11.62); // The cubed one
        System.out.printf("Volume of the cube box:%.4f%n ",m2.volume());

        Box8 m3=new Box8(3.5,5.5,6.5);
        System.out.println("Volume of the original one: "+m3.volume());

        Box8 m4=new Box8(m3);
        double v=m4.volume();
        System.out.println("Volume of the cloned constructor: "+v);

        BoxWeight m=new BoxWeight(4.5,5.5,6.5,7.5);
        System.out.println("Value of the 4th parament: "+m.weight);


    }
}
