package SelfLearningByHerbertSchildt.Chapter14.GeekForGeeks;


/*
We can also write generic methods that can be called with different types
 of arguments based on the type of arguments passed to the generic method.
 The compiler handles each method.
 */


public class GenericMethod {
    static <T> void genericDisplay(T element){
        System.out.println(element.getClass().getName()+" = "+element);
    }

    //Driver class
    public static void main(String[] args){
        GenericMethod.genericDisplay(11);
        GenericMethod.genericDisplay("GeekForGeeks");
        GenericMethod.genericDisplay(1.0);
    }

}
