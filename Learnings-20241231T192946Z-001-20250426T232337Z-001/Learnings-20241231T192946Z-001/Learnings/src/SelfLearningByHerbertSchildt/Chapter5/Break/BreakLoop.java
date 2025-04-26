package SelfLearningByHerbertSchildt.Chapter5.Break;

// Suing break to exit a loop
public class BreakLoop {
    public static void main(String[] args){
        for(int i=0; i<100; i++){
            if(i==10) break; // terminate the loop when i is 10
            System.out.println("i: "+i);
        }
        System.out.println("\nLoop Complete.");
    }
}
