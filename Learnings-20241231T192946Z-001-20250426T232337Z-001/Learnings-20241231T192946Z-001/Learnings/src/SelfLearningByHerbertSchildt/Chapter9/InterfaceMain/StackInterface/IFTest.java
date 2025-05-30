package SelfLearningByHerbertSchildt.Chapter9.InterfaceMain.StackInterface;

// Define an integer stack interface
interface IntStack {
    void push(int item);
    int pop();
}

// An implementation of InStack that uses fixed storage
class FixedStack implements IntStack {
    private int[] stck;
    private int tos;

    // Allocate and initialize stack
    FixedStack(int size){
        stck=new int[size];
        tos=-1;
    }

    // Push an item into the stack
    public void push(int item){
        if(tos==stck.length) System.out.println("Stack is full");
        else stck[++tos]=item;
    }

    public int pop(){
        if(tos<0){
            System.out.println("Stack underflow");
            return 0;
        }
        else return stck[tos--];
    }
}

public class IFTest {
    public static void main(String[] args) {
        IntStack myStack1=new FixedStack(5);
        IntStack myStack2=new FixedStack(8);

        // Push items into te stack
        for(int i=0;i<5;i++)myStack1.push(i);
        for(int i=0;i<8;i++)myStack2.push(i);

        // Pop those numbers form the stack
        System.out.println("Elements of MyStack1: ");
        for(int i=0;i<5;i++) System.out.print(myStack1.pop()+" ");
        System.out.println();
        System.out.println("Elements of myStack2: ");
        for(int i=0;i<8;i++) System.out.print(myStack2.pop()+" ");
    }
}