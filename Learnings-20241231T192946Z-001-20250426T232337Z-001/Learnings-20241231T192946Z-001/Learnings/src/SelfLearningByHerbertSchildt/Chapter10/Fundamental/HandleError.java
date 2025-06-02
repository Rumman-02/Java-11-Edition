package SelfLearningByHerbertSchildt.Chapter10.Fundamental;

// Handle exception and move on

import java.util.Random;

public class HandleError {
    public static void main(String[] args){
        int a,b,c;
        Random r=new Random();
        for(int i=0;i<32000;i++){
            try {
                b= r.nextInt();
                c= r.nextInt();
                a=12345/(b/c);
            }catch (ArithmeticException e){
                System.out.println("Exception: "+e);
                a=0; // seta  to zero and continue
            }
//            catch (ArithmeticException e){
//                System.out.println("Division by zero.");
//                a=0; // seta  to zero and continue
//            }
            System.out.println("a: "+a);
        }
    }
}