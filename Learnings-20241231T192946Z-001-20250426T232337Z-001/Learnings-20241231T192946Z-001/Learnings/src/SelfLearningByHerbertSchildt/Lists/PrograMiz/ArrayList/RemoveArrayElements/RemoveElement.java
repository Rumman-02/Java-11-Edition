package SelfLearningByHerbertSchildt.Lists.PrograMiz.ArrayList.RemoveArrayElements;

import java.util.ArrayList;

public class RemoveElement {
    public static void main(String[] args){

        ArrayList<String> animals=new ArrayList<>();

        // Add elements to the arrayList
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Horse");
        System.out.println("ArrayList: "+animals);


        // Remove elements form the ArrayList
        String str=animals.remove(1);
        System.out.println("Removed element: "+str);
        System.out.println("New ArrayList: "+animals);
    }
}
