package SelfLearningByHerbertSchildt.Lists.PrograMiz.ArrayList.IterateArrayList;

import java.util.ArrayList;

public class ArrayListIteration {
    public static void main(String[] args){
        ArrayList<String> animals=new ArrayList<>();

        // Insert all the elements
        animals.add("Cow");
        animals.add("Cat");
        animals.add("Horse");
        System.out.println("List of all animals: "+animals);

        System.out.println();

        // Iterate using for-each loop
        System.out.println("Accessing individual animals: ");
        for(String language: animals){
            System.out.print(language);
            System.out.print(", ");
        }
    }
}
