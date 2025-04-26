package SelfLearningByHerbertSchildt.Chapter5.For;

// Multiple statement in a loop

public class Comma {
    public static void main(String[] args){
        int a,b;

        //Multiple variables under a loop

        for(a=1,b=4; a<b; a++,b--){
            System.out.println("a = "+a);
            System.out.println("b = "+b);
        }

    }
}
