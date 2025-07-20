package SelfLearningByHerbertSchildt.Lists.PrograMiz.LinkedList.AddElement;

import java.util.LinkedList;

public class LinkedListAddElement {
    public static void main(String[] args){

        // Create a LinkedList
        LinkedList<String> animals=new LinkedList<>();

        // add() method without the index parameter
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        System.out.println("LinkedList: "+animals);

        // add() method with the index parameter
        animals.add(1,"Horse");
        System.out.println("Updated Linked list: "+animals);
    }
}
