package SelfLearningByHerbertSchildt.Chapter6.Class;

class Box2{
    double height;
    double width;
    double depth;
}

public class BoxDemo2 {
    public static void main(String[] args){
        Box2 myBox1=new Box2();
        Box2 myBox2=new Box2();

        //Assign values to myBox1's instance variables
        myBox1.height=10;
        myBox1.width=20;
        myBox1.depth=15;

        //Assign values to myBox2's instance variables
        myBox2.height=3;
        myBox2.width=6;
        myBox2.depth=9;

        double vol1=myBox1.height* myBox1.width* myBox1.depth;
        double vol2=myBox2.height* myBox2.width * myBox2.depth;

        System.out.println("Volume of box1: " + vol1);
        System.out.println("volume of Box2: "+vol2);

    }
}
