package SelfLearningByHerbertSchildt.Chapter5.Continue;


//Demonstrate continue
public class continue1 {
    public static void main(String[] args){
        for(int i=0; i<10; i++){
            System.out.print(i+" ");
            if(i%2==0) continue;

            /* The loop will continue if only "i%2==0"
            and will print a new line
            */

            System.out.println(" ");
        }
    }
}
