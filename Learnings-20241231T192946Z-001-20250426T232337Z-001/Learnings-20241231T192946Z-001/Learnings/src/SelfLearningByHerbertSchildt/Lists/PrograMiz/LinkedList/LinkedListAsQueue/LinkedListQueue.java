package SelfLearningByHerbertSchildt.Lists.PrograMiz.LinkedList.LinkedListAsQueue;

/*   Queue<>

1. Usage of peek() > get the first one
2. Usage of poll() > get and remove first element
3. Usage of offer() > adds specified element at the end of the LinkedList
 */


import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
    public static void main(String[] args){
        Queue<String> languages=new LinkedList<>();

        // Add elements to the Queue
        languages.add("Python");
        languages.add("Java");
        languages.add("C");
        System.out.println("LinkedList: "+languages);

        // Access the first element> peek()
        String str1=languages.peek();
        System.out.println("Accessed Element: "+str1);

        // Access and remove the first element
        String str2=languages.poll();
        System.out.println("Removed element: "+str2);
        System.out.println("LinkedList after poll(): "+languages);


        // Add element at the end > Usage of offer()
        languages.offer("Maven");
        System.out.println("linkedList after offer(): "+languages);
    }
}
