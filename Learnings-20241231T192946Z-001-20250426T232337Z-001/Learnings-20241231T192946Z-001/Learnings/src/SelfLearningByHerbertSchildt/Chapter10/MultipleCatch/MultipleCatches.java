package SelfLearningByHerbertSchildt.Chapter10.MultipleCatch;

// Demonstrate multiple catch statements

public class MultipleCatches {
    public static void main(String[] args){
        System.out.println("Before the code starts.");
        try{
            int a=args.length;
            System.out.println("a = "+a);
            int b=42/a;
            int[] c={1};
            c[42]=99;
        }catch (ArithmeticException e){
            System.out.println("divided by 0: "+e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index of ob: "+e);
        }
        System.out.println("After the try/catch blocks.");
    }
}
