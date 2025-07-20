package SelfLearningByHerbertSchildt.Lists.PrograMiz.ArrayList.ChangeArrayListElement;

import java.util.ArrayList;

public class ChangeElement {
    public static void main(String[] args){

        ArrayList<String> languages =new ArrayList<>();

        // Add elements to the arrayList
        languages.add("Java");
        languages.add("Python");
        languages.add("C");
        System.out.println("Elements of the ArrayList: "+languages);

        // Change the element of the arrayList
        languages.set(1,"JavaScript");
        languages.add(3,"JavaScript");
        System.out.println("Modified ArrayList: "+languages);
    }
}
