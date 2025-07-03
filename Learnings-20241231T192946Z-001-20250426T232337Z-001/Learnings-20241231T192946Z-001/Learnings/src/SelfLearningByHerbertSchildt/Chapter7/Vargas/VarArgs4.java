package SelfLearningByHerbertSchildt.Chapter7.Vargas;

/*
Varargs, OverLoading and ambiguity
 */

/* This program will not compile, rather it will generate an error

after certain case, it will compile
 */

public class VarArgs4 {

    static void vaTest(int ... v){
        System.out.println("vaTest(int ...) "+"Numbers of args: "+v.length+" Contents. ");

        for(int x:v)
            System.out.print(x+ " ");
        System.out.println();


    }

    static void vaTest(boolean ... v){
        System.out.println("vaTest (boolean ...) "+"Number of args: "+v.length+ " contents.");

        for(boolean x:v)
            System.out.print("x: "+v);
        System.out.println();

    }

    public static void main(String[] args){
        vaTest(1,2,3);
        vaTest(true,false,true);

        /*
        It will cause an error: ambiguity
         */
        //vaTest();
    }
}
