package SelfLearningByHerbertSchildt.Lists.GeekForGeeks.IteratingListInterface;

import java.util.ArrayList;
import java.util.List;

public class IterationList {
    public static void main(String[] args){

        //Creating an empty arrayList of String type
        List<String> l1=new ArrayList<>();

        // Adding element to above object of ArrayList
        l1.add("Geek");
        l1.add("Geeks");

        /*
        Adding element to specified position
        inside the List object
         */
        l1.add(1,"for");


        // Using for loop for the iteration
        for(int i=0;i<l1.size();i++)
            System.out.print(l1.get(i)+" ");

        // New line for better readability
        System.out.println();


        // Using for-each loop for iteration
        for(String str:l1)
            //Printing all the elements which was inside object
            System.out.print(str+" ");
    }
}
