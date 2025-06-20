package SelfLearningByHerbertSchildt.Chapter10.Throws;

public class ThrowsDemo {

    static void throwOne() throws IllegalAccessException{
        System.out.println("Inside the throwOne.");
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args){
        try{
            throwOne();
        }catch(IllegalAccessException e){
            System.out.println("Caught the exception: "+e);
        }
    }
}
