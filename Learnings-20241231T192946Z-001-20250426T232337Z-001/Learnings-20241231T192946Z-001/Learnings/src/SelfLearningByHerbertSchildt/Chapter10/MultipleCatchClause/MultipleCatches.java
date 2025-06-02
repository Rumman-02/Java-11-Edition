package SelfLearningByHerbertSchildt.Chapter10.MultipleCatchClause;

// Demonstrate multiple catch statement

public class MultipleCatches {
    public static void main(String[] args){
        try{
            int a= args.length;
            System.out.println("a = "+a);
            int[] c={1};
            c[42]=99;
            int b=42/a;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index oob: "+e);
        } catch (ArithmeticException e){
            System.out.println("Divide by 0: "+e);
        }
        System.out.println("After try/catch blocks.");
    }
}
