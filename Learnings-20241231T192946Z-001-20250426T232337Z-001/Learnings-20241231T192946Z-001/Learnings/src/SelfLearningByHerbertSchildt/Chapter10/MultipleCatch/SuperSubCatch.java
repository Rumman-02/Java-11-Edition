package SelfLearningByHerbertSchildt.Chapter10.MultipleCatch;

public class SuperSubCatch {
    public static void main(String[] args){
        try{
            int a=0;
            int b=42/a;
        }catch(Exception e){
            System.out.println("Generic Exception catch.");
        }
        /*
        This catch is never reached because
        Arithmetic Exception is the SubClass of Exception
        */

        /*
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception is called.");
        }
         */
    }
}
