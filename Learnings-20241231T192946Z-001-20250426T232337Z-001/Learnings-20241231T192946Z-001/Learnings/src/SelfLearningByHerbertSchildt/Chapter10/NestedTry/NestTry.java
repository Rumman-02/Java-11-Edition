package SelfLearningByHerbertSchildt.Chapter10.NestedTry;

// An example of nested try statements.

public class NestTry {
    public static void main(String[] args){
        try{
            int a=args.length;

            /*
            If no command line arguments are present, the
            following statement will generate a divide-by-zero
            exception
             */

            int b=42/a;
            System.out.println("a = "+a);

            try { //Nested try block
                /*
                if one command line argument is used, then
                 a divide-by-zero exception will generate then
                by the following code
                 */
                if(a==1) a=a/(a-a); // Division by zero

                /*
                If two command line arguments are used, then
                generate an out-of-bounds exception
                 */

                if(a==2) {
                    int[] c={1};
                    c[42]=99; // Generate an out-of-bounds exception
                }
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array index of bounds: "+e);
            }
        }catch(ArithmeticException e){
            System.out.println("divided by 0: "+e);
        }
    }
}
