package SelfLearningByHerbertSchildt.Chapter8.BasicInheritance;

// a simple example of inheritance

// create a superclass
class A{
    int i,j;
    void showj(){
        System.out.println("i and j: "+i+" and "+j);
    }
}

//create a subclass by extending class A
class B extends A{
    int k;

    void showk(){
        System.out.println("k: "+k);
    }

    void sum(){
        System.out.println("i+j+k: "+(i+j+k));
    }
}


public class Simpleinheritance {
    public static void main(String[] args){
        A superOb=new A();
        B subOb=new B();

        // The superClass may be used by itself
        superOb.i=10;
        superOb.j=20;
        System.out.println("Contents of superOb: ");
        superOb.showj();
        System.out.println();

        /*
        This subclass has the access to all the public member of its superClass
         */
        subOb.i=7;
        subOb.j=8;
        subOb.k=9;
        System.out.println("Contents of subClass: ");
        superOb.showj();
        subOb.showk();
        System.out.println();

        System.out.println("Sum of i, j and k: ");
        subOb.sum();
    }
}
