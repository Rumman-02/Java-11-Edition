package SelfLearningByHerbertSchildt.Chapter7.Recursion;

class Rectest{
    int[] values;
    Rectest(int i){
        values=new int[i];
    }
    //Display array recursively
    void printArray(int i){
        if(i==0) return;
        else printArray(i-1);
        System.out.println("["+(i-1)+"]"+values[i-1]);
    }
}

public class Recursion2 {
    public static void main(String[] args){
        Rectest ob=new Rectest(10);

        for(int i=0;i<10;i++) ob.values[i]=i;
        ob.printArray(10);
    }
}
