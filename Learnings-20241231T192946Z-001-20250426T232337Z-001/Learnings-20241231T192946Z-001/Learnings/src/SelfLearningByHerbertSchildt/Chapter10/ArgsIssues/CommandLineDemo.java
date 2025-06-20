package SelfLearningByHerbertSchildt.Chapter10.ArgsIssues;

public class CommandLineDemo {
    public static void main(String[] args){
        if(args.length!=0){
            System.out.println("Number of Arguments: "+args.length);

            for(int i=0;i<args.length;i++) System.out.println("Argument: "+i+":"+" "+args[i]);
        }
        else {
            System.out.println("No Arguments were passed");
        }
    }
}
