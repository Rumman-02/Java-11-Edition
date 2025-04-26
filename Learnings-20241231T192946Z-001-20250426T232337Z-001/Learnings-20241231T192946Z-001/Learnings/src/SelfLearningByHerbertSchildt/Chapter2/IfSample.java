package SelfLearningByHerbertSchildt.Chapter2;
/*Demonstrate the If.
Call the file IfSample.java
 */
public class IfSample {
    public static void main(String[] args){
//        int x,y;
        int x=10;
        int y=20;
        if(x<y) System.out.println("x is less than y");
        x=x*2;
        if(x==y) System.out.println("x now equal to y");
        x=x*2;
        if(x>y) System.out.println("x now greater than y");
        //This won't display anything
        if(x==y) System.out.println("you won't see this");
    }
}
