package SelfLearningByHerbertSchildt.Chapter4;


//Demonstrate several assignment operations
public class OpEquals {
    public static void main(String[] args){
        int a=1;
        int b=2;
        int c=3;
        System.out.println();

        a+=5; //a=a+5;
        b*=4; //b=b*4;
        c+=a*b; //c=c+a*b;
        System.out.println("First value of c: "+c);
        System.out.println();
        c%=6; //c=c%6;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
    }
}