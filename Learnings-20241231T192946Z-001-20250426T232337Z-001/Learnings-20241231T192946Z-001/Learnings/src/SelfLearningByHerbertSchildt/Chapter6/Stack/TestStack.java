package SelfLearningByHerbertSchildt.Chapter6.Stack;

//This class defines an integer stack that can hold 10 values

class Stack{
    int[] stck=new int[10];
    int index;

    Stack(){
        index=-1;
    }
    int push(int item){
        if(index == 9){
            System.out.println("Stack overflown");
            return 0;
        }
        else
            return stck[++index]=item;
    }
    int pop(){
        if(index<0){
            System.out.println("Stack underflow");
            return 0;
        }
        else return stck[index--]; //Index==9 here then decreases
    }
}

public class TestStack {
    public static void main(String[] args){
        Stack myStack1=new Stack();
        //Stack myStack2=new Stack();
        System.out.println("Pushed items: ");
        for(int i=0;i<10;i++){
            System.out.println(myStack1.push(i));
        }
        System.out.println();
        System.out.println("Popped Items: ");
        for (int i=0;i<10;i++){
            System.out.println(myStack1.pop());
        }
    }

}
