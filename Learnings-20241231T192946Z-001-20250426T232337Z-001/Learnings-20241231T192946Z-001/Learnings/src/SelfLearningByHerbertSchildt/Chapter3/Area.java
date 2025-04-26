package SelfLearningByHerbertSchildt.Chapter3;
// Compute the area of a circle

public class Area {
    public static void main(String[] args){
        double  r, a; //pi  //64-bit
        r=10.8; //radius of a circle
        //pi=3.1416; // pi, approximately
        a= Math.PI*Math.sqrt(r);
        //System.out.println("Area of a circle is: "+ a);
        System.out.printf("Area of a circle: %.5f%n", a);
    }
}
