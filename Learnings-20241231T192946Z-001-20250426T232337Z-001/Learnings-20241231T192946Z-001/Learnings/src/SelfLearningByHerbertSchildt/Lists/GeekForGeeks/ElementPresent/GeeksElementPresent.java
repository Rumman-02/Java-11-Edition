package SelfLearningByHerbertSchildt.Lists.GeekForGeeks.ElementPresent;

import java.util.*;

/*
Usage of contains(_) in case of check the presence of the element
 */

public class GeeksElementPresent {
    public static void main(String[] args){

        /*
        Creating an object of List Interface, implemented by ArrayList class
         */
        List<String> al=new ArrayList<>();

        // Adding elements of object of List Interface
        al.add("Geek");
        al.add("for");
        al.add("Geeks");

        // Checking if the element is present using contains() method
        boolean isPresent=al.contains("Geeks");
        System.out.println("Is 'Geeks' present in the list? "+isPresent);

    }
}
