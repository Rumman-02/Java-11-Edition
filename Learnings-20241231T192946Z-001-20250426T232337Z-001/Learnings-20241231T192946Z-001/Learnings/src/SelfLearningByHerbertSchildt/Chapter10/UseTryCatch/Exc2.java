package SelfLearningByHerbertSchildt.Chapter10.UseTryCatch;

public class Exc2 {
    public static void main(String[] args){
        int d,a;
        try{// Monitor a block of code
            d=0;
            a=42/d;
            System.out.println("It will not print");
        }catch (ArithmeticException e ){ //Catch divided-by-zero error
            System.out.println("Division by zero.");
        }
        System.out.println("After the catch statement.");
    }
}
