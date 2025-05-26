package SelfLearningByHerbertSchildt.Chapter8.DynamicMethodDispatch;

// Dynamic Method dispatch
class A{
    void callMe(){
        System.out.println("Inside A's callMe method.");
    }
}

class B extends A{
    // Override callMe()
    void callMe(){
        System.out.println("Inside B's callMe method.");
    }
}

class C extends B{
    // Override callme()
    void callMe(){
        System.out.println("Inside C's callMe method");
    }
}

public class Dispatch {
    public static void main(String[] args){

        A a=new A(); // object of type A
        B b=new B(); // object of type B
        C c=new C(); // object of type C

        /*
        Method Dispatch Example
         */

        A r; // Obtain reference of type A

        r=a; // r refers to an objet A
        r.callMe(); // Calls A's version of callMe()

        r=b; // r refers to the object b
        r.callMe(); // Calls B's version of callMe()

        r=c; // refers to an object C
        r.callMe(); // Call C's version of callMe()

        /*
        Normal, calling a method through reference
         */

        System.out.println();

        a.callMe();
        b.callMe();
        c.callMe();
    }
}
