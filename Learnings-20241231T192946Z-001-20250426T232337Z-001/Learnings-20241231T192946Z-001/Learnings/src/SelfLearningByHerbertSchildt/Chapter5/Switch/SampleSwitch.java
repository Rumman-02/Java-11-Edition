package SelfLearningByHerbertSchildt.Chapter5.Switch;


//A simple example of Switch
public class SampleSwitch {
    public static void main(String[] args){
        for(int i=0;i<7;i++)
            switch (i) {
                case 0:
                    System.out.println("i is zero");
                    break; //Optional
                case 1:
                    System.out.println("i is one.");
                    break; //Optional
                case 2:
                    System.out.println("i is two.");
                    break; //Optional
                case 3:
                    System.out.println("i is three.");
                    break; //Optional
                case 4:
                    System.out.println("i is four.");
                    break; //Optional
                case 5:
                    System.out.println("i is five.");
                    break; //Optional
                default:
                    System.out.println("go to hell!");
            }
    }
}
