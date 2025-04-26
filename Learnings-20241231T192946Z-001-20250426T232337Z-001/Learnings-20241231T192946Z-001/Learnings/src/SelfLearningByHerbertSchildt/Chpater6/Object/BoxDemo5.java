package SelfLearningByHerbertSchildt.Chpater6.Object;

// This program uses a parameterized method
class Box{
    double height;
    double width;
    double depth;

    //Compute and return a value
    double volume(){
        return height*width*depth;
    }

    //Set dimensions of the box
    void setDim(double a, double b, double c){
        height=a;
        width=b;
        depth=c;
    }
}

public class BoxDemo5 {
    public static void main(String[] args){
        Box myBox1=new Box();
        Box myBox2=new Box();

        //Initialize each box
        myBox1.setDim(12,20,15);
        myBox2.setDim(3,6,9);
        System.out.println();
        //get volume of the first box
        double volume1= myBox1.volume();
        System.out.println("Volume of first box: "+volume1);

        //Get volume of second box
        double volume2= myBox2.volume();
        System.out.println("\nVolume of second box: "+volume2);
    }
}
