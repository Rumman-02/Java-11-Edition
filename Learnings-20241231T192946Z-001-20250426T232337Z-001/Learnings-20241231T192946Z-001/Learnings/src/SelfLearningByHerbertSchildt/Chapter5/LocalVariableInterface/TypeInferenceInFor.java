package SelfLearningByHerbertSchildt.Chapter5.LocalVariableInterface;

//Sue type inference in  afor loop
public class TypeInferenceInFor {
    public static void main(String[] args){


        /* Local variable type inference ( "var" ) can be used or  initialized only in
         "for" or "for-each" loops
        */


        // for
        // Use type inference with the "for loop" control variable
        System.out.print("Values of x: ");
        for(var x=2.5; x<100; x=x*2)
            System.out.print(x + " ");


        System.out.println("\n");


        // for-each
        // Use type inference with the iteration "for-each" variable
        int[] nums= {1,2,3,4,5,6};
        System.out.print("Values in nums array: ");
        for(var x: nums)
            System.out.print(x + " ");


        System.out.println();
    }
}
