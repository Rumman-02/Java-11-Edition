package SelfLearningByHerbertSchildt.Chapter14.BoundedTypes;

/*
In this version of stats, the type argument for T must be either a number or a class derived form number
 */

class Stats<T extends Number>{
    T[] nums;


    /*
    Pass the constructor a reference to an array of type parameter subclass
     */
    Stats(T[] o){
        nums=o;
    }

    // Return type double in all cases
    double average(){
        double sum=0.0;
        for(int i=0;i< nums.length;i++)
            sum+=nums[i].doubleValue();

        return sum/ nums.length;
    }
}


public class BoundsDemo{
    public static void main(String[] args){
        Integer[] inums={1,2,3,4,5};
        Stats<Integer> iob=new Stats<Integer>(inums);
        double v= iob.average();
        System.out.println("iob average is: "+v);

        Double[] dnums={1.1,2.2,3.3,4.4,5.5};
        Stats<Double> dob=new Stats<Double>(dnums);
        double w= dob.average();
        System.out.println("dob average is: "+w);
    }
}
