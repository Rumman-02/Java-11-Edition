package SelfLearningByHerbertSchildt.Chapter10.Throw;

// Demonstrate throw
public class throwDemo {

    static void demoproc(){
        try{
            throw new NullPointerException ("Demo");
        }catch(NullPointerException e){
            System.out.println("Caught inside demoProc");
            throw e;  // Rethrow the exception
        }
    }

    public static void main(String[] args){
        try{
            demoproc();
        }catch(NullPointerException e){
            System.out.print("Recaught> "+e);
            /*
            1. Here we have rethrown the exception (rethrow e) to aware the "main()" method
            2. As we have rethrown, e.getMessage() will only print the message not the exception (Line: 19)
             */

        }
    }
}
