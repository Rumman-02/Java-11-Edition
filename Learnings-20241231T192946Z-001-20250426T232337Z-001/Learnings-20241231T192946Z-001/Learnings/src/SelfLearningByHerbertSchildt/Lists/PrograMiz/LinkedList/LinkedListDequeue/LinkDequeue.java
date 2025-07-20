package SelfLearningByHerbertSchildt.Lists.PrograMiz.LinkedList.LinkedListDequeue;

/*    Dequeue<>
1. addfirst(), addLast()
2. removeFirst(), removeLast()
3. peekFirst(), peekLast()
 */


import java.util.Deque;
import java.util.LinkedList;

public class LinkDequeue {
    public static void main(String[] args){
        Deque<String> animals=new LinkedList<>();

        // add element at the beginning
        animals.add("Cow");
        System.out.println("LinkedList: "+animals);
        System.out.println();

        // add element at the first using addFirst()
        animals.addFirst("Dog");
        System.out.println("LinkedList after addFirst(): "+animals);
        System.out.println();

        // add element at the last using addLast()
        animals.addLast("Zebra");
        System.out.println("LinkedList after addLast(): "+animals);
        System.out.println();

        // Remove first element > removeFirst()
        animals.removeFirst();
        System.out.println("LinkedList after removeFirst(): "+animals);
        System.out.println();

        // Remove last element > removeLast()
        animals.removeLast();
        System.out.println("LinkedList after removeLast(): "+animals);
    System.out.println();
    }
}
