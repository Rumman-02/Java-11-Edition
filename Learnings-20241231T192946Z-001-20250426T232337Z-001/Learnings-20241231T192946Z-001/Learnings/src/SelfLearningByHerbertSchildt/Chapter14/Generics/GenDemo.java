package SelfLearningByHerbertSchildt.Chapter14.Generics;

/*
 A simple generics class, Here, T is a type parameter
 that will be replaced by a real type, when an object is created
 */


class Gen<T>{
    T ob;  // Declare an object of type T


    /*
    Pass constructor a reference to an object of type T
     */
    Gen(T o){
        ob=o;
    }

    // return ob
    T getOb(){
        return ob;
    }

    // Show type of T
    void showType(){
        System.out.println("Type of T is: "+ob.getClass().getName());
    }
}


// Demonstrate a generic class
public class GenDemo {
    public static void main(String[] args){

        // Step 1:
        //Gen<Integer> iob=new Gen<Integer>(88);


        // Step 2:
        // Create a gen reference Integer
        Gen<Integer> iob;

        /*
        Create a Gne<Integer> object and assign its reference to iob.
        Notice th usage of Autoboxing to encapsulate the value 88 within an Integer object
         */
        iob=new Gen<Integer> (88);

        // Show the type of data used by iob
        iob.showType();

        // Get the value of Iob, notice that no cast is needed
        int v=iob.getOb();
        System.out.println("Value of iob: "+v);

        System.out.println();


        // For String type

        Gen<String> strob=new Gen<String>("Generics Test");
        strob.showType();
        String str=strob.getOb();
        System.out.println("Value: "+str);
    }
}
