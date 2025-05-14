//package SelfLearningByHerbertSchildt.Chpater6.methods;
//// This program includes a method inside the box3 class

//class Box3{
//    double height;
//    double width;
//    double depth;
//
//    //Display the volume of the box
//    public void volume(){
//        System.out.print("Volume is: ");
//        System.out.println(height*width*depth);
//    }
//}
//public class BoxDemo3 {
//    public static void main(String[] args){
//        Box3 myBox1=new Box3(); // Box3() is a constructor call-constructor of the Box3 class to create an object
//        Box3 myBox2=new Box3();
//
//        myBox1.height=10;
//        myBox1.width=20;
//        myBox1.depth=15;
//
//        myBox2.height=3;
//        myBox2.width=6;
//        myBox2.depth=9;
//
//        myBox1.volume();
//        myBox2.volume();
//    }
//}

package SelfLearningByHerbertSchildt.Chapter6.methods;
// This program includes a method inside the box3 class

class Box3{
    double height;
    double width;
    double depth;

    //Display the volume of the box
    public void volume(double height, double width, double depth){
        System.out.print("Volume is: ");
        System.out.println(height*width*depth);
    }
}
public class BoxDemo3 {
    public static void main(String[] args){
        Box3 myBox1=new Box3(); // Box3() is a constructor call-constructor of the Box3 class to create an object
        Box3 myBox2=new Box3();

        myBox1.volume(10,20,15);
        myBox2.volume(3,6,9);
    }
}
