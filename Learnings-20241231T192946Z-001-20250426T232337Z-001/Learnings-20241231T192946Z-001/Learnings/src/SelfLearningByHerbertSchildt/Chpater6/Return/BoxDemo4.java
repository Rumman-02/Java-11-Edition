package SelfLearningByHerbertSchildt.Chapter6.Return;

// Now, volume() returns the value to the volume

class box4{
    double height;
    double width;
    double depth;

    double volume(){
        return height*width*depth;
    }
}

public class BoxDemo4 {
    public static void main(String[] args){
        double vol1, vol2;

        box4 mybox1=new box4();
        box4 mybox2=new box4();

        mybox1.height=10.55;
        mybox1.width=20.11;
        mybox1.depth=15;

        mybox2.height=3;
        mybox2.width=6;
        mybox2.depth=9;

        vol1= mybox1.volume();
        //vol1=(int)mybox1.volume(); if I put int, there will be 0 after the decimal, as vol is double
        System.out.printf("Volume of box1: %.2f%n ",vol1);
        //System.out.println("Volume of box2: "+ (int) vol1); //Type conversion, val will be int

        vol2=mybox2.volume();
        System.out.println("Volume of box2: "+ vol2);




    }
}
