package SelfLearningByHerbertSchildt.Chapter7.ArrayRevisited;

//Improved stack class that uses the length array member
class Stack{
    private int[] stck;
    private int tos;

    //Allocate and Initialize stack
    Stack(int size){
        stck = new int[size];
        tos=-1;
    }

    // Push item to the stack
    void push(int item){
        if(tos == stck.length){
            System.out.println("Stack is full.");
        }
        else {
            stck[++tos] = item;
        }
    }

    // Pop item from the stack
    int pop(){
        if(tos<0){
            System.out.println("Stack underflow");
            return 0;
        }
        else
            return stck[tos--];

    }
}

public class TestStack2 {
    public static void main(String[] args){
        Stack s1=new Stack(5);
        Stack s2=new Stack(8);

        // Push some number to the stack
        for(int i=0;i<5;i++) s1.push(i);
        for(int i=0;i<8;i++) s2.push(i);

        // Pop those numbers from the stack
        System.out.println("Values in s1: ");
        for (int i=0;i<5;i++)
            System.out.println(s1.pop());
        System.out.println("values in s2: ");
        for (int i=0;i<8;i++)
            System.out.println(s2.pop());
    }
}
