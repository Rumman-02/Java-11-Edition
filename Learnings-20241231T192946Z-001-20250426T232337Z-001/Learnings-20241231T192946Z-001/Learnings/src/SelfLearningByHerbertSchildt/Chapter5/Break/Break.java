package SelfLearningByHerbertSchildt.Chapter5.Break;

// Use break as a civilized form of goto
public class Break {
    public static void main(String[] args){
        boolean t=true;

        first:{
            second:{
                third:{
                    System.out.println("\nBefore the break.");
                    if(t) break second; //break out the second block
                    System.out.println("\nThis won't execute");
                }
                System.out.println("\nThis won't execute.");
            }
            System.out.println("\nThis is after the second block");
        }
    }
}
