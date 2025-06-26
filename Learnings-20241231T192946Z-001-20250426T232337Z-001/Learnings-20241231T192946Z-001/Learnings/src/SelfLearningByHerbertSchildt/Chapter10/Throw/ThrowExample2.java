package SelfLearningByHerbertSchildt.Chapter10.Throw;

public class ThrowExample2 {

//    static void checkAge(int age){
//        try {
//            if (age < 18) throw new IllegalArgumentException("Age must be 18 or above.");
//            else System.out.println("Access granted, Welcome!");
//        }catch (IllegalArgumentException e){
//            System.out.println("Caught an exception in method: "+e);
//        }
//    }
//
//    public static void main(String[] args){
//        checkAge(12);
//        System.out.println("Program continues....");
//    }

    static void checkAge(int age){
        try {
            if (age < 18) throw new IllegalArgumentException("Age must be 18 or above.");
            else System.out.println("Access granted, Welcome!");
        }catch (IllegalArgumentException e){
            System.out.println("Caught an exception in method: ");
            throw e;
        }
    }

    public static void main(String[] args){
        try{
            checkAge(12);

        }catch (IllegalArgumentException e){
            System.out.println("caught inside the main method: "+e);
        }
        System.out.println("Program continues....");
    }
}
