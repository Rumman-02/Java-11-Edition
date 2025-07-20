package SelfLearningByHerbertSchildt.Lists.PrograMiz.LinkedList.AccessLinkedListElement;

/*
The get() method of the LinkedList class is used to access an element from the LinkedList.
 */

import java.util.LinkedList;

public class AccessElement {
    public static void main(String[] args){
        LinkedList<String> languages=new LinkedList<>();

        // add elements in thr LinkedList
        languages.add("Python");
        languages.add("Java");
        languages.add("JavaScript");
        System.out.println("LinkedList: "+languages);

        // Get the elements form the linkedList
        String str=languages.get(1);
        System.out.println("Element of index 1: "+str);
    }
}
