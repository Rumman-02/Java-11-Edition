package SelfLearningByHerbertSchildt.Chapter10.UseTryCatch;

// Handle exceptions and move on
import java.util.Random;

public class HandleError {
    public static void main(String[] args){
        int b,c,a;
        Random r=new Random();
        for(int i=0;i<32000;i++){
            try{
                b=r.nextInt();
                c=r.nextInt();
                a=12345/(b/c);
            }catch (ArithmeticException e){
                System.out.println("Divison by zero.");
                a=0; // set to "0" and continue
            }
            System.out.println("a: "+a);
        }
    }
}
