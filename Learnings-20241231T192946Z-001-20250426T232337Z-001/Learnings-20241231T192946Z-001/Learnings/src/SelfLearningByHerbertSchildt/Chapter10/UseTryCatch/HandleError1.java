package SelfLearningByHerbertSchildt.Chapter10.UseTryCatch;

import java.util.Random;

public class HandleError1 {
    public static void main(String[] args){
        int b,c,a;
        Random r=new Random();
        for(int i=0;i<32000;i++){
            try{
                b=r.nextInt();
                c=r.nextInt();
                a=12345/(b/c);
            }catch (ArithmeticException e){
                System.out.println("Exception: "+e);
                a=0;
            }
            System.out.println("a: "+a);
        }
    }
}
