package SelfLearningByHerbertSchildt.Lists.PrograMiz.LinkedList.RemoveElemetLinkedList;

import java.util.LinkedList;

public class ElementRemove {
    public static void main(String[] args){
        LinkedList<String> languages=new LinkedList<>();

        // add elements to the LinkedList
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("Kotlin");
        System.out.println("LinkedList: "+languages);
        System.out.println();


        // Remove random element from the LinkedList
        String str=languages.remove(2);
        try {
            if(languages.contains("Groovy")){
                System.out.println("Found!");
            }
            else {
                throw new IllegalArgumentException("Illegal argument");
            }
        } catch (IllegalArgumentException e) {
            //System.out.println(e);
            System.out.println(e.getMessage());
        }
        System.out.println("Updated LinkedList after removal of an element: "+str);
    }
}
