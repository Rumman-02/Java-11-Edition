package SelfLearningByHerbertSchildt.Chapter9.InterfaceMain.MultipleInterface;

interface alpha{
    default void reset(){
        System.out.println("Reset form alpha");
    }
}

/*
Method 2: Here beta will extend the alpha and another method will be uses to call the default method
***  It will be declared using the "super()"  ***
 */
interface beta extends alpha{
    default void reset(){
        System.out.println("Reset from beta");
    }
    // If we want to access the default value of alpha, we have to use ""default""
    default void callOfAlpha(){
        alpha.super.reset();
    }
}
class MyClass implements alpha,beta{
    @Override
    public void reset() { // It is default, so it is "public"
        System.out.println("A new class that implements both defaults");
    }
}
public class book {
    public static void main(String[] args){
        MyClass m=new MyClass();
        m.reset();
        // Calling the default value of alpha
        System.out.println();
        m.callOfAlpha();
    }
}



/*
Method 1: MyClass implements both alpha and beta, also @overRidden the reset() method
 */
//interface beta{
//    default void reset(){
//        return "Reset from beta";
//    }
//}
//class MyClass implements alpha,beta{
//    @Override
//    public void reset() { // It is default, so it is "public"
//        System.out.println("A new class that implements both defaults");
//    }
//}
//public class book {
//    public static void main(String[] args){
//        MyClass m=new MyClass();
//        m.reset();
//    }
//}
