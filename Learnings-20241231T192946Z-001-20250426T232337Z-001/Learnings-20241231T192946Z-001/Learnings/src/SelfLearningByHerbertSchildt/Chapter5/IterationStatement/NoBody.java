package SelfLearningByHerbertSchildt.Chapter5.IterationStatement;

// The target of a loop can be empty
public class NoBody {
    public static void main(String [] args){
        // Target is to find the midpoint between two values

        int i=100, j=200;
        while(i++ < j--); // no-body in the loop

        System.out.println("Mid-point is: "+i);
    }
}
