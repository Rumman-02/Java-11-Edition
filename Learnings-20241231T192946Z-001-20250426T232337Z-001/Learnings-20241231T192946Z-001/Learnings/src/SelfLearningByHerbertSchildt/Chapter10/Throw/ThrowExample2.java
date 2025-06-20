package SelfLearningByHerbertSchildt.Chapter10.Throw;

public class ThrowExample2 {

    static void checkAge(int age){
        try {
            if (age < 18) throw new IllegalArgumentException("Age must be 18 or above.");
            else System.out.println("Access granted, Welcome!");
        }catch (IllegalArgumentException e){
            System.out.println("Caught an exception in method: "+e.getMessage());
        }
    }

    public static void main(String[] args){
        checkAge(12);
        System.out.println("Program continues....");
    }
}
