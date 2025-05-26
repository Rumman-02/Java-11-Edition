package SelfLearningByHerbertSchildt.Chapter8.MethodOverRiding;

// Using run-time polymorphism
class figure{
    double dim1;
    double dim2;

    figure(double a, double b){
        dim1=a;
        dim2=b;
    }

    double area(){
        System.out.println("Area for figure is still undefined.");
        return 0;
    }
}

class triangle extends figure{
    triangle(double a, double b){
        super(a,b);
    }

    // Override area of the rectangle
    double area(){
        System.out.println("Inside area of a triangle:");
        return (dim1*dim2)/2;
    }
}

class rectangle extends figure{
    rectangle(double a, double b){
        super(a,b);
    }

    // Override the area of rectangle
    double area(){
        System.out.println("inside area of a rectangle: ");
        return dim1*dim2;
    }
}


public class findAreas{
    public static void main(String[] args){
        figure f=new figure(10,10);
        triangle t=new triangle(10,8);
        rectangle r=new rectangle(9,5);

        /*
        here "figure is the superClass"
         */

        figure figuref;
        figuref=f;
        System.out.println("Area is: "+figuref.area());
        System.out.println();

        figuref=t;
        System.out.println("Area is: "+figuref.area());
        System.out.println();

        figuref=r;
        System.out.println("Area is: "+figuref.area());
    }
}
