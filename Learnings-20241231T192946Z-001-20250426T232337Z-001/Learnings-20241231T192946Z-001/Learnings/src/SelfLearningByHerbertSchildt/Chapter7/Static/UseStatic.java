package SelfLearningByHerbertSchildt.Chapter7.Static;


//Demonstrate static variables, methods and blocks
public class UseStatic {
    static int a=3;
    static int b=3;

    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

        static{
            System.out.println("Static block initialized");
            b=a*4;
        }

        public static void main(String[] args){
            meth(42);
        }
}
