package SelfLearningByHerbertSchildt.Chapter10.MultipleCatchClause;

/*
This program contains an error

A subclass must come before its superclass in a series of catch statement.
If not, unreachable code will be created and a compile-time-error will result
 */

public class SuperSubCatch {
    public static void main(String[] args){
//        try{
//            int a=0;
//            int b=42/a;
//        } catch (Exception e) {
//            System.out.println("Generic exception detected");
//        }/*
//        This catch is never reached because ArithmeticException is a subclass of Exception
//        */
//        catch (ArithmeticException e){
//            System.out.println("This is never reached.");
//        }
    System.out.println("Tutorial!");
    }
}