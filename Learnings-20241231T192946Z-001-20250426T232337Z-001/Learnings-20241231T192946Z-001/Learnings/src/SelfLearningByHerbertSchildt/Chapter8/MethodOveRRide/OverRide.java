package SelfLearningByHerbertSchildt.Chapter8.MethodOveRRide;

// Method overriding
class A{
    int i,j;
    A(int a, int b){
        i=a;
        j=b;
    }

    // Display i and j
    void show(){
        System.out.println(" i and j: "+i+" , "+j);
    }
}

class B extends A{
    int k;

    B(int a, int b, int c){
        super(a,b);
        k=c;
    }

    // Display k - this overrides show() in A
    void show(){
        System.out.println("i: "+i+","+"j: "+j+","+"k: "+k);
    }
}


public class OverRide {
    public static void main(String[] args){
        B subOb=new B(1,2,3);
        System.out.print("This call is form Subclass: " );
        /*
        Calling the show() of "SubClass"
         */
        subOb.show();

        /*
        Calling the show() of SuperClass
         */
        A supOb=new A(5,6);
        System.out.print("This call is form SuperClass: ");
        supOb.show();
    }
}
