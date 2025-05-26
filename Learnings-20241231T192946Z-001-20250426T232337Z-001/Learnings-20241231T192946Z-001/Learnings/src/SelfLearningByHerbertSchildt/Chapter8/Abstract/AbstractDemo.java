package SelfLearningByHerbertSchildt.Chapter8.Abstract;

// A simple demonstration of abstract class
abstract class A{
    abstract void callMe();

    // concrete methods are still allowed in abstract class
    void callMeToo(){
        System.out.println("This is a concrete method");
    }
}

class B extends A{
    void callMe(){
        System.out.println("B's implementation of callMe()");
    }
}

public class AbstractDemo {
    public static void main(String[] args){
        B b=new B();
        b.callMe();
        b.callMeToo();
    }
}