package SelfLearningByHerbertSchildt.Chapter10.Throw;

public class ThrowExample1 {

    // A method that checks age and throws an exception if it is invalid
    static void checkAge(int age){
        try{
            if(age <18) throw new IllegalArgumentException("Age must be 18 or older.");
            else System.out.println("Access granted, Welcome!");
        }catch (IllegalArgumentException e){
            System.out.println("Caught the inner exception: ");
            throw e;
        }
    }

    public static void main(String[] args){
        try{
            checkAge(21);
        }catch (IllegalArgumentException e){
            System.out.println("Caught outer exception- "+e);
            //System.out.println(e.getLocalizedMessage());
        }
        System.out.println("Program Continues....");
    }
}
