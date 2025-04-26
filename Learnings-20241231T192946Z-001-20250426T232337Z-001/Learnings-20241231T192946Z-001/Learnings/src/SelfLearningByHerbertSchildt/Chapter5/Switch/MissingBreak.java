package SelfLearningByHerbertSchildt.Chapter5.Switch;


// In a switch, Break statements are optional
public class MissingBreak {
    public static void main(String[] args){
        for(int i=0; i<12; i++)
            switch (i){
                case 0:
                case 2:
                case 3:
                case 4: // Will pass the value from (0-4) 5 times
                    System.out.println("i is less than 5");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("i is less than 10"); // Will pass the value from (5-9) 9 times
                    break;
                default: // Will pass the value from (10-11) 2 times (value of i < 12)
                    System.out.println("i is 10 or more");
            }
    }
}
