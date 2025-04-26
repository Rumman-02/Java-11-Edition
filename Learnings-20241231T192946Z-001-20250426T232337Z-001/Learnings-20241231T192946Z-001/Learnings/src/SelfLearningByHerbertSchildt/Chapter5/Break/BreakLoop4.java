package SelfLearningByHerbertSchildt.Chapter5.Break;

//Using break to exit form nested loops

public class BreakLoop4 {
    public static void main(String[] args){

        outer: for(int i=0; i<3; i++){
            System.out.print("Pass "+i+": ");
                for(int j=0; j<100; j++){
                    if(j==10) break outer; // Exit both loops > "when j is 10"
                    System.out.print(j+" ");
                }
            System.out.println("This will not print.");
        }
        System.out.println("Loops complete.");


//
//        one: for(int i=0; i<3; i++){
//            System.out.print("Pass "+i+": ");
//            }
//
//        for(int j=0; j<100; j++){
//            if(j==10) break one; //Error, "one" is outside of the declared block
//            System.out.println(j+" ");
//        }
    }
}
