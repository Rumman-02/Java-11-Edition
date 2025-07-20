package SelfLearningByHerbertSchildt.Lists.PrograMiz.ArrayList.AddElements;

import java.util.ArrayList;

public class AddElement {
    public static void main(String[] args){

        // Create an arrayList
        ArrayList<String> languages=new ArrayList<>();
        languages.add("Java");
        languages.add("C++");
        languages.add("Python");
        System.out.println("List of languages: "+languages);


        /*
        Add elements to a specified index of the list
         */

        // Add "JavaScript" at index number 1
        languages.add(1,"JavaScript");
        System.out.println("Updated list: First up gradations: "+languages);

        // Add "C" at index of 3
        languages.add(3,"C");
        System.out.println("Updated list: Second up gradations: "+languages);

    }
}
