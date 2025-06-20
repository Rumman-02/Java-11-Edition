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
            //System.out.print("Recaught "+e.getMessage());
            System.out.print("Recaught ");
            //System.out.println(e);
        }
    }
}
