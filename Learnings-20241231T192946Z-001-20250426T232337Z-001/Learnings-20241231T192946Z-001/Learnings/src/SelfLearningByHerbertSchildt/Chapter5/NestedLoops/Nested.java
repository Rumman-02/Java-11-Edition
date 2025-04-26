package SelfLearningByHerbertSchildt.Chapter5.NestedLoops;

// Loops may be nested

public class Nested {
    public static void main(String[] args){

        // Can't understand
        for(int i=0; i<10; i++){
            for(int j=i; j<10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n");

        // My logic
        for(int i=0; i<10; i++){
            for(int j=0; j<10-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
