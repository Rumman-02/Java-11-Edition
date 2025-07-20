package SelfLearningByHerbertSchildt.Lists.PrograMiz.LinkedList.ChangeElemetofLinkedList;

import java.util.LinkedList;

public class ChangeElement {
    public static void main(String[] args){
        LinkedList<String> languages=new LinkedList<>();

        // add elements to the linkedList
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("Java");
        System.out.println("LinkedList: "+languages);

        // Change element of index 3
        languages.set(3,"Kotlin");
        System.out.println("Updated LinkedList: "+languages);
    }
}
