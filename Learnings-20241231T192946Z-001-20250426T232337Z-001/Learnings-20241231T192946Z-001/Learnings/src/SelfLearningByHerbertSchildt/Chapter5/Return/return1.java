package SelfLearningByHerbertSchildt.Chapter5.Return;

// Demonstrate return
public class return1 {
    public static void main(String[] args){
        boolean t=true;
        System.out.println("\nBefore the return.");

        if(t) return; //Return to the caller

        System.out.println("This will not execute");
    }
}
