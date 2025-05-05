package SelfLearningByHerbertSchildt.Chapter6.ParameterizedMethod;

// This program shows parameterized method

//class box5{   // Instance variables (permanent)
//
//    double height;
//    double width;
//    double depth;
//
//    //Set dimension box
//    void setDim(double h, double w, double d){  // Set method (h, d, d == local variable)
//        height=h;
//        width=w;
//        depth=d;
//    }
//
//    //Compute and return volume
//    double volume(){
//        return height*width*depth;
//    }
//
//}
//
//public class BoxDemo5 {
//    public static void main(String[] args){
//        double vol1, vol2;
//
//        box5 mybox1=new box5();
//        box5 mybox2=new box5();
//
//        mybox1.setDim(10,20,15);
//        mybox2.setDim(3,6,9);
//
//        vol1=mybox1.volume();
//        vol2=mybox2.volume();
//
//        System.out.println("Volume of first box: "+ vol1);
//        System.out.println("Volume of second box: "+vol2);
//    }
//}
class box5{   // Instance variables (permanent)

    double height;
    double width;
    double depth;

    //Set dimension box
//    void setDim(double h, double w, double d){  // Set method (h, d, d == local variable)
//        height=h;
//        width=w;
//        depth=d;
//    }

    //Compute and return volume
    double volume(){
        return height*width*depth;
    }

}

public class BoxDemo5 {
    public static void main(String[] args){
        double vol1, vol2;

        box5 mybox1=new box5();
        //box5 mybox2=new box5();

        mybox1.height=10;
        mybox1.width=20;
        mybox1.depth=15;
//        mybox1.setDim(10,20,15);
//        mybox2.setDim(3,6,9);

        vol1=mybox1.volume();
        //vol2=mybox2.volume();

        System.out.println("Volume of first box: "+ vol1);
        //System.out.println("Volume of second box: "+vol2);
    }
}
