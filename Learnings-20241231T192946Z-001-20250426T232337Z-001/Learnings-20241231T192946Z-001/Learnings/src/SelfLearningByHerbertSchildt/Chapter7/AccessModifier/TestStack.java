package SelfLearningByHerbertSchildt.Chapter7.AccessModifier;

//This class defines an integer stack that can hold 10 values
class Stack{
    /*
    Now both stack and tos are private. That means they can not
    be accidentally or maliciously altered in a way that would be
    harmful to that stack
     */
    private int[] stck=new int[10];
    private int tos;

    //Initialize top-of-stack
    Stack(){
        tos=-1;
    }

    //Push an item into the stack
    void push(int item){
        if(tos==9) System.out.println("Stack is full");
        else stck[++tos]=item;
    }

    //Pop item from the stack
    int pop(){
        if(tos<0){
            System.out.println("Stack underflow");
            return -1;
        }
        else
            return stck[tos--];
    }
}

public class TestStack {
    public static void main(String[] args){
        Stack m1=new Stack();
        Stack m2=new Stack();

        for(int i=0;i<10;i++) m1.push(i);
        for(int i=10;i<20;i++) m2.push(i);

        System.out.println("Stack in m1:");
        for(int i=0;i<10;i++)
            System.out.println(m1.pop());
        System.out.println("Stack in m2:");
        for(int i=10;i<20;i++)
            System.out.println(m2.pop());
    }
}
