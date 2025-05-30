package SelfLearningByHerbertSchildt.Chapter9.InterfaceMain.StackInterface.prac1;


// Define an integer stack interface
interface IntStack {
    void push(int item);
    int pop();
}

/*
implement a growable Stack
 */
class DynStack implements IntStack{
    private int[] stck;
    private int tos;

    DynStack(int size){
        stck=new int[size];
        tos=-1;
    }

    // push items into the stack
    public void push(int item){
        // if the stack is full, allocate a larger stack
        if(tos==stck.length-1){
            int[] temp=new int[stck.length*2];
            for(int i=0;i<stck.length;i++) temp[i]=stck[i];
            stck=temp;
            stck[++tos]=item;
        }
        else stck[++tos]=item;
    }

    public int pop(){
        if(tos<0){
            System.out.println("Stack underFlown");
            return 0;
        }
        else return stck[tos--];
    }
}

public class IFTest2 {
    public static void main(String[] args){
        IntStack m1=new DynStack(5);
        IntStack m2=new DynStack(8);

        // Push items into te stack
        for(int i=0;i<12;i++)m1.push(i);
        for(int i=0;i<20;i++)m2.push(i);

        // Pop those numbers form the stack
        System.out.println("Elements of MyStack1: ");
        for(int i=0;i<12;i++) System.out.print(m1.pop()+" ");
        System.out.println();
        System.out.println("Elements of myStack2: ");
        for(int i=0;i<20;i++) System.out.print(m2.pop()+" ");
    }
}
