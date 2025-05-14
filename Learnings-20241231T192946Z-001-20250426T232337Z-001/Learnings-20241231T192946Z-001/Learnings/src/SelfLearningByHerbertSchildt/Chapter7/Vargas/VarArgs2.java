package SelfLearningByHerbertSchildt.Chapter7.Vargas;

//use varargs with standard arguments

public class VarArgs2 {
    /*
    here msg is a normal parameter and c is a varargs
    parameter
     */
    static void vaTest(String msg, int ... v){
        System.out.println(msg +v.length+" Contents: ");
        for(int x:v){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        vaTest("One varargs: ",10);
        vaTest("Three varargs: ",1,2,3);
        vaTest("No varargs: ");
    }
}
