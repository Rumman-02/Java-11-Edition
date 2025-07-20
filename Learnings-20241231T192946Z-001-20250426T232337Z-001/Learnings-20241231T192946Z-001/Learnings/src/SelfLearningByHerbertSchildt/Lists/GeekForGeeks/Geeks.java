package SelfLearningByHerbertSchildt.Lists.GeekForGeeks;

import java.util.*;

public class Geeks {
    public static void main(String[] args){

        // Creating a List String using LinkedList<>
        List<String> li=new ArrayList<>();

        // Adding elements in List
        li.add("Java");
        li.add("Python");
        li.add("DSA");
        li.add("C++");

        System.out.println("Elements of list are: ");

        // Iteration throughout the list
        for(String s:li){
            System.out.println(s);
        }
        System.out.println();

        // Accessing elements
        System.out.println("Element of index 1: "+li.get(1));
        System.out.println();

        // Updating element
        li.set(1,"JavaScript");
        System.out.println("Updated List: "+li);
        System.out.println();

        // Removing element
        li.remove("C++");
        System.out.println("List after removing an element: "+li);

    System.out.println();
    }
}
