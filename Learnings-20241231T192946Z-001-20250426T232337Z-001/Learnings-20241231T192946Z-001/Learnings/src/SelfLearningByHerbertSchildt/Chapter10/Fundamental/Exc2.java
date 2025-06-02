package SelfLearningByHerbertSchildt.Chapter10.Fundamental;

public class Exc2 {
    public static void main(String[] args){
        int d, a;
        try{ // Monitor a block of code
            d=0;
            a=42/d;
            System.out.println("This will not be printed");
        }catch (ArithmeticException e){ // catch divided-by-zero error
            System.out.println("Division by zero");
        }
        System.out.println("After a catch statement.");
    }
}
