package SelfLearningByHerbertSchildt.Chapter5.ForEach.MultiDimension;

// Search an array using for-each style for
public class Search {
    public static void main(String[] args){
        int[] nums={6,8,3,7,5,6,1,4};
        int val=5;
        boolean found=false;

        // Use for-each style for to search nums for val
        for(int x:nums){ //Iteration through every variable
            if(x==val);
            found =true;
            break;
        }
        if (found) System.out.println("Value found!");
    }
}
