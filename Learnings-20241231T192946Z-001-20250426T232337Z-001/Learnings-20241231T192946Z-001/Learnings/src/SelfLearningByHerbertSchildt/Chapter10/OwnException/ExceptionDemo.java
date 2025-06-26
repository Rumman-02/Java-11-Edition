package SelfLearningByHerbertSchildt.Chapter10.OwnException;

// This program creates a custom exception type
class MyException extends Exception{
    private int detail;

    MyException(int a){
        detail=a;
    }

    public String toString(){
        /*
        toString() > Returns a String object containing a description of the exception.
        This method is called by println() when outputting the throwable object
         */
        return "MyException[" + detail+ "]";
    }
}

class ExceptionDemo {

    static void compute(int a) throws MyException{
        System.out.println("called compute(" +a+ ")");
        if(a>10)
            throw new MyException(a);
        System.out.println("Normal exit.");
    }

    public static void main(String[] args){
        try{
            compute(1);
            compute(20);
        } catch (MyException e) {
            System.out.println("caught: "+e);
        }
    }
}
