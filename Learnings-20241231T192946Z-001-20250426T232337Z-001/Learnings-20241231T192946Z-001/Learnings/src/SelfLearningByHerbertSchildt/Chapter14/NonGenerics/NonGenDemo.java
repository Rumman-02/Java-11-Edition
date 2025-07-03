package SelfLearningByHerbertSchildt.Chapter14.NonGenerics;

/*
NonGen is functionally equivalent to gen but does not use generics
 */

class NonGen{
    Object ob;  // ob is now of type object

    /*
    Pass a constructor a reference to an object of type object
     */
    NonGen(Object o){
        ob=o;
    }

    // Return object type
    Object getOb(){
        return ob;
    }

    // Show type of ob
    void showType(){
        System.out.println("type of ob is: "+ob.getClass().getName());
    }
}

public class NonGenDemo {
    public static void main(String[] args){
        NonGen iob=new NonGen(55);
        iob.showType();


        /*
        Here, Integer or String is not declared,so We have to define the variable type before we want to get the variable
         */
        int v=(Integer) iob.getOb();
        System.out.println("value: "+v);

        System.out.println();

        NonGen strob=new NonGen("Generics");
        strob.showType();

        /*
        Here, Integer or String is not declared,so We have to define the variable type before we want to get the variable
         */
        String str=(String) strob.getOb();
        System.out.println("value: "+str);
    }
}
