package SelfLearningByHerbertSchildt.Chapter5.ForEach;

//Ue of fo-each style ofr the loop
public class forEach {
    public static void main(String[] args){
        int[] nums={5,6,7,8,9,11,12,15,17,21};
        int sum = 0;

        // use for-each style for to display and sum the values
        for(int x:nums){  // int x=0;  ;x++

            System.out.println("value is: "+ x); //value of "num[x]"

            sum += x; // sum= sum+ num[x]
        }
        System.out.println("\nSummation: "+sum);
    }

}
