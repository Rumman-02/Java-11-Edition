package SelfLearningByHerbertSchildt.RandomProblems.Stack.StackBasic;

// Java program implementing Stack Class

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args){

        // Create a new Stack
        Stack<Integer> s= new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        /*
        Here isEmpty(_) is used, is a  functionality of stack class
         */

        }
    }
}
