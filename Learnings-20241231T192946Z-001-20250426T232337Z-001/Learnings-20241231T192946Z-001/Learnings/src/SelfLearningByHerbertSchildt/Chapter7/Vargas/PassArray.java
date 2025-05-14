package SelfLearningByHerbertSchildt.Chapter7.Vargas;

/*
Use an array to pass variable number of arguments ta method.
 This is an old-style approach to variable-length-arguments
 */

public class PassArray {

    static void vaTest(int[] v) {
        System.out.println("Number of args: " + v.length + " contents: ");

        for (int x:v)
            System.out.print(x+ " ");
        System.out.println();
    }
    public static void main(String[] args){
        /*
        Notice how many array must be created to hold
        the arguments
         */

        int[] n1={10};
        int[] n2= {1,2,3};
        int[] n3={ };
        vaTest(n1);
        vaTest(n2);
        vaTest(n3);
    }
}
