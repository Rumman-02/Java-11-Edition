package SelfLearningByHerbertSchildt.Chapter7.Recursion;

//A simple example of recursion
class Factorial{
    // this is recursive method
    int fact(int n){

        if(n==0)
            return 1;
        int result=fact(n-1)*n;
        System.out.println(result);
        return result;
    }
}

public class Recursion {
    public static void main(String[] args){
        Factorial f=new Factorial();
        System.out.println("Factorial of 3 is: "+f.fact(3));
    }
}
