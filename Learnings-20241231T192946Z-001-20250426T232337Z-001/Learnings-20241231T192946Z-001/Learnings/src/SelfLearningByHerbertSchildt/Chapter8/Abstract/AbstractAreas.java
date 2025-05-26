package SelfLearningByHerbertSchildt.Chapter8.Abstract;

// Using abstract class methods and classes
abstract class Figure{
    double dim1;
    double dim2;

    Figure(double a, double b){
        dim1=a;
        dim2=b;
    }
    // area() is now an abstract method
    abstract double area();
}


class Rectangle extends Figure{

    Rectangle(double a, double b){
        super(a,b);
    }

    // OverRide area for rectangle

    @Override
    double area() {
        System.out.println("Inside area of a rectangle.");
        return dim1*dim2;
    }
}

class Triangle extends Figure{
    Triangle(double a, double b){
        super(a,b);
    }

    @Override
    double area() {
        System.out.println("Inside area of a triangle.");
        return (dim1*dim2)/2;
    }
}


public class AbstractAreas {
    public static void main(String[] args){
        Rectangle r=new Rectangle(9,5);
        System.out.println(r.area());

        Triangle t=new Triangle(10,8);
        System.out.println(t.area());

        /*
        Figure figuref; // Reference of a "abstract" Figure
        figuref=r;
        System.out.println(figuref.area());
        figuref=t;
        System.out.println(figuref.area());
        //System.out.println(figuref.dim1);

         */
    }
}
