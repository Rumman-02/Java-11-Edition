package SelfLearningByHerbertSchildt.Chapter10.NestedTry;

/*
This statement can be implicitly nested via call to methods
 */

public class MethNestTry {

    static void nestTry(int a){  // Nested try block

        try{
        /*
        if one command line argument is used, then
        a divide-by-zero exception will be generated
        */

            if(a==1) a=a/(a-a);  // Division by zero

            /*
            if two-command-line args are used, then
            generate an out-of-bounds exception
             */

            if(a==2){
                int[] c={1};
                c[42]=99; // Generate an out-of-bounds exception
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index of bounds: "+e);
        }
    }

    public static void main(String[] args){
        try{
            int a=args.length;
            System.out.println("a = "+a);
            nestTry(a);
            /*
            if no command line arguments are passed, the
            following statement will generate a divide-by
            zero exception
             */

            int b=42/a;
        }catch(ArithmeticException e){
            System.out.println("divided by 0: "+e);
        }
    }
}
