package SelfLearningByHerbertSchildt.Chapter8.ReferenceDemo;

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

    BoxWeight(double a, double b, double c, double d) {
        height = a;
        width = b;
        depth = c;
        weight = d;
    }
}

    // Here, Box is extended to include color
class BoxColor extends Box8{
    String color;
    BoxColor (double h, double w, double d, String c){
        height=h;
        width=w;
        depth=d;
        color=c;
    }
}

class RefDemo{
    public static void main(String[] args){
        double vol;

        Box8 m1=new Box8(); // Calling the empty one
        System.out.println("\nVolume of  default one: "+m1.volume());

        Box8 m2=new Box8(11.62); // The cubed one
        System.out.printf("\nVolume of the cube box:%.4f%n ",m2.volume());

        Box8 m3=new Box8(3.5,5.5,6.5);
        System.out.println("\nVolume of the original one: "+m3.volume());

        Box8 m4=new Box8(m3);
        double v=m4.volume();
        System.out.println("\nVolume of the cloned constructor: "+v);

        BoxWeight weightBox=new BoxWeight(4.5,5.5,6.5,7.5);
        System.out.println("\nValue of the 4th parament(weight) : "+weightBox.weight);
        vol=weightBox.volume();
        System.out.println("Volume of weightBox is: "+vol);

        BoxColor colorBox=new BoxColor(12.2,13.2,14.2,"Brown");
        System.out.println("\nValue of the color: "+colorBox.color);
        System.out.printf("Volume of the coloredBox: %.4f%n ",colorBox.volume());

        /*
        the following statement is invalid because plainBox
        does not define a ""weight"" member
         */
//        Box8 plainBox=new Box8();
//        plainBox=BoxWeight;
//        vol=plainBox.volume();
//        System.out.println("volume of plainBox is: "+vol);
    }
}

