package SelfLearningByHerbertSchildt.RandomProblems.Stack.StackOperation;

/*
Java program to add the elements to the stack
 */

import java.util.Stack;

class GeeksA {

    // Pushing  element at the top of the stack
    static void stack_push(Stack<Integer> stack){
        for(int i=0;i<5;i++){
            stack.push(i);
        }
    }

    // Popping element from  the stack
    static void stack_pop(Stack<Integer> stack){
        System.out.println("Pop operation.");

        for(int i=0;i<5;i++){
            System.out.println(stack.pop());
        }
    }

    // Displaying element on the top of the stack
    static void stack_peek(Stack<Integer> stack){
        Integer element=(Integer) stack.peek();
        System.out.println("Element on stack top:" +element);
    }

    // Searching element from the stack
    static void stack_search(Stack<Integer> stack, int element){
        Integer pos=stack.search(element);
        if(pos== -1)System.out.println("element no found");
        else System.out.println("element found at position: "+pos);
    }

    public static void main(String[] args){
        Stack<Integer> stack= new Stack<>();
        stack_push(stack);
        stack_pop(stack);
        stack_push(stack);
        stack_peek(stack);
        stack_search(stack,3);
        stack_search(stack,7);
    }
}
