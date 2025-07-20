package SelfLearningByHerbertSchildt.Lists.PrograMiz.ArrayList.AccessArrayListElement;

import java.util.ArrayList;

public class AccessElement {
    public static void main(String[] args){

        ArrayList<String> animals=new ArrayList<>();

        // Add elements to the arrayList
        animals.add("cat");
        animals.add("dog");
        animals.add("cow");
        System.out.println("ArrayList: "+animals);

        // Get the element form the arrayList

        String str=animals.get(1); // Index value
        System.out.println("Element of index 1: "+str);

    }
}
