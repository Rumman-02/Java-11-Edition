package SelfLearningByHerbertSchildt.Chapter14.WildCardEntry;


// USe wildCard

class stats <T extends Number>{
    T[] nums;  // Array number of the subCLass

    /*
    Pass the constructor reference to an array of type number or subclass
     */
    stats(T[] o){
        nums=o;
    }

    // Return the type double in all cases
    double average(){
        double sum=0.0;
        for(int i=0;i<nums.length;i++)
            sum+=nums[i].doubleValue();

        return sum/ nums.length;
    }

    /*
    Determine if the two averages are same
     */

    // **Notice the use of "wildCard"
    boolean sameAvg(stats<?> ob){
        if(average()==ob.average())
            return true;

        return false;
    }
}


public class WildCardDemo {
    public static void main(String[] args) {

        // Integer cases
        Integer[] inums = {1, 2, 3, 4, 5};
        stats<Integer> iob = new stats<>(inums);
        double v = iob.average();
        System.out.println("Average of 'Integer' is: " + v);

        // Double cases
        Double[] dnums = {1.1, 2.2, 3.3, 4.4, 5.5};
        stats<Double> dob = new stats<>(dnums);
        double w = dob.average();
        System.out.println("Average of 'Double' is: " + w);

        //Float Cases
        Float[] fnums = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        stats<Float> fob = new stats<>(fnums);
        double x = fob.average();
        System.out.println("Average of 'float' is:" + x);
        System.out.println();

        /*
        See which arrays have same average
         */

        System.out.println("Average of iob and dob");
        if (iob.sameAvg(dob)) {
            System.out.println("Avg is same.");
        }
        else {
            System.out.println("Average differs.");
        }
        System.out.println();
        System.out.println("Average of iob and fob");
        if (iob.sameAvg(fob)) {
            System.out.println("Avg is same.");
        } else {
            System.out.println("Avg differs.");
        }
    }
}
