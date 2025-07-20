package SelfLearningByHerbertSchildt.Lists.PrograMiz.ArrayList.Introduction;

/*
Implementations of ArrayList()
 */


import java.util.ArrayList;
import java.util.List;

public class List1 {
    public static void main(String[] args){

        // Create list suing arrayList class
        List<Integer> numbers=new ArrayList<>();

        //  Add elements to the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println("List: "+numbers);

        // Access elements form the list
        Integer number=numbers.get(2); // Index value
        System.out.println("Accessed element: "+number);

        // Remove element form the list
        Integer removed_element=numbers.remove(1);
        System.out.println("Removed Element: "+removed_element);

        System.out.println("Updated List: "+numbers);
    }
}
