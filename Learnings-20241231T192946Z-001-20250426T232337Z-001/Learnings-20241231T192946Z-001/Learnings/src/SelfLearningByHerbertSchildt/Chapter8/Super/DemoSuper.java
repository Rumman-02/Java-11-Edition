package SelfLearningByHerbertSchildt.Chapter8.Super;

// A complete implementation of BoxWeight
class Box9{
    private double height;
    private double width;
    private double depth;

    // Construct clone of an object
    Box9(Box9 ob){
        height=ob.height;
        width=ob.width;
        depth=ob.depth;
    }

    //Constructor used when all dimensions are used
    Box9(double w, double h, double d){
        height=w;
        width=h;
        depth=d;
    }

    // Constructor used when no dimensions are specified
    Box9(){
        height=-5;
        width=-1;
        depth=-1;
//      System.out.println("height is: "+height);
    }

    // Constructor when cube is created
    Box9(double len){
        height=width=depth=len;
    }

    // Compute and return the volume
    double volume(){
        return height*width*depth;
    }

    /*
    Now it is time to return the values of SuperClass
     */
    double getHeight(){
        return height;
    }
}

// BoxWeight now fully implements all the constructors
class BoxWeight extends Box9{
    double weight;

    // Construct cloe of an object
    BoxWeight(BoxWeight ob){ // ob is the object
        super(ob);
        weight=ob.weight;
    }

    // Constructor when all parameters are specified
    BoxWeight(double w, double h, double d,double m){
        super(w,h,d); // called superclass Constructor (Box9)
        weight=m;
    }

    // Default constructor
    BoxWeight(){
        super();
        weight=-1;
    }

    // Constructor used when cube is created
    BoxWeight(double len, double m){
        super(len);
        weight=m;
    }
}


public class DemoSuper {
    public static void main(String[] args){

        BoxWeight myBox1=new BoxWeight(10,20,15,34.3);

        // myBox2 is another box9 like myBox1
        BoxWeight myBox2=new BoxWeight(2,3,4,0.076);

        BoxWeight myBox3=new BoxWeight(); // default
        BoxWeight myCube=new BoxWeight(3,2);
        BoxWeight myClone=new BoxWeight(myBox1); // Cloned constructor (SubClass)
        double vol;

        vol= myBox1.volume();
        /*
        vol=height*width*depth (SuperClass volume)
        */
        System.out.println("Volume of myBox1 is: (for subClass only)> "+vol);

        /*
        but for volume of subClass >>
         */
        vol= vol*myBox1.weight;
        System.out.println("Volume including the *weight*(myBox1) :> "+vol);
        System.out.println("Weight of the box is:(myBox1) "+myBox1.weight);
        System.out.println();


        vol= myBox2.volume();
        System.out.println("Volume of the second box:((myBox2)) "+vol);
        System.out.println("Weight of the second box(myBox2): "+myBox2.weight);
        System.out.println();

        vol= myBox3.volume();
        System.out.println("Volume of the default box:(myBox3) "+vol);
        System.out.println("Volume of the default box:(myBox3) including weight: "+(vol*myBox3.weight));
        System.out.println();

        vol= myClone.volume();
        System.out.println("Volume for the cloned Constructor: "+vol);
        System.out.println("volume of the cloned Constructor including *weight*: "+(myClone.weight*vol));
        System.out.println("Weight of myClone: "+myClone.weight);
        System.out.println();

        vol=myCube.volume();
        System.out.println("Volume of the cube: "+vol);
        System.out.println("Volume of the cube including the weight: "+vol*myCube.weight);
        System.out.println("Weight of myCube: "+myCube.weight);

//        BoxWeight m1=new BoxWeight();
//        System.out.println(m1.weight);
//        System.out.println(m1.volume());
//
        Box9 n1=new Box9(1.2,2.2,3.2);
        System.out.println("Volume for the SuperClass: "+n1.volume());
        System.out.println("Height value from the superclass Constructor: "+n1.getHeight());
        System.out.println(myBox1.getHeight()); // Accessed from subClass



    }
}
