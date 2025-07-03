package SelfLearningByHerbertSchildt.Chapter14.GenericsWithTwoParam;

/*
A simple Generics class with two parameters: T and V
 */

import javax.print.DocFlavor;

class TwoGen<T,V>{
    T ob1;
    V ob2;


    TwoGen(T o1, V o2){
        ob1=o1;
        ob2=o2;
    }

    T getOb1(){
        return ob1;
    }

    V getOb2(){
        return ob2;
    }

    void showType(){
        System.out.println("Type of T is: "+ob1.getClass().getName());
        System.out.println("Type of V is: "+ob2.getClass().getName());
    }
}

public class SimpGen {
    public static void main(String[] args){
        TwoGen<String, Integer> tgObj=new TwoGen<String,Integer>("Generics",88);
        String strob=tgObj.getOb1();
        System.out.println("Value of T: "+strob);
        int intob=tgObj.getOb2();
        System.out.println("Value of V: "+intob);
        System.out.println();
        tgObj.showType();
    }
}
