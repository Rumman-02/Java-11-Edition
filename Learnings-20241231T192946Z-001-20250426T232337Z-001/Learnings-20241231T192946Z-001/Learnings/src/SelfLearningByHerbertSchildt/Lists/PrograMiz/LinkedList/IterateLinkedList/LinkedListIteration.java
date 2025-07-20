package SelfLearningByHerbertSchildt.Lists.PrograMiz.LinkedList.IterateLinkedList;

import java.util.LinkedList;

public class LinkedListIteration {
    public static void main(String[] args){
        
        // Creating a LinkedList<>
        LinkedList<String> animals=new LinkedList<>();
        animals.add("Cow");
        animals.add("Cat");
        animals.add("Dog");
        System.out.println("LinkedList: "+animals);
        System.out.println();

        // Using for-each loop
        System.out.println("Accessing LinkedList element: ");
        System.out.print("{ ");
        for(String animal:animals){
            System.out.print(animal);
            System.out.print(", ");
        }
        System.out.print("}");
    }
}
