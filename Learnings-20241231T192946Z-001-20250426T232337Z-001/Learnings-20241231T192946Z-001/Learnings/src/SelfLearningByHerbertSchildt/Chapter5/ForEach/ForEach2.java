package SelfLearningByHerbertSchildt.Chapter5.ForEach;

// Use break with a for-each style for
public class ForEach2 {
    public static void main(String[] args){
        int sum=0;
        int[] nums={1,2,3,4,5,6,11,8,9,10}; //It will stop the iteration until it finds the value, here 11 & it will add to the sum

        //use for to sum and display the values
        for(int x: nums){
            System.out.println("value is: "+x);
            sum+=x;
            if(x==11) break; //Stop and breaks the value when x==5 (x increments)
        }
        System.out.println("\nSummation  is: "+sum);
    }
}