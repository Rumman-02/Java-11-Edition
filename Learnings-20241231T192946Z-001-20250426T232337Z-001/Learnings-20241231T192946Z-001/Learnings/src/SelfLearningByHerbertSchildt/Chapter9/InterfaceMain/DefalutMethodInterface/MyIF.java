package SelfLearningByHerbertSchildt.Chapter9.InterfaceMain.DefalutMethodInterface;

public interface MyIF {
    /*
    This is a normal interface method declaration, it does not define a default implementation
     */
    int getNumber();

    /*
    This is a default method. Notice that it provides a default implementation
     */
    default String getString(){
        return "Default String.";
    }
}

// Implement MyIF

class MyIFImp implements MyIF{
    /*
    only getNumber() defined by MyIF needs to be implemented, getString() cane be allowed to default
     */
    public int getNumber(){
        return 100;
    }
}

class MyIFImp2 implements MyIF{
    public int getNumber(){
        return 550;
    }

    // OverRide getString()
    public String getString(){
        return "This is another String.";
    }
}

// Use the default method.
class DefaultMethodDemo{
    public static void main(String[] args) {
        MyIFImp obj=new MyIFImp();
        /*
        Can call getNumber(), because it is explicitly implemented by MyIFImp:
         */
        System.out.println(obj.getNumber());


        /*
        Can also call getString(), because of default implementation
         */
        System.out.println(obj.getString());
        System.out.println();

        /*
        This is the implementation of a new Class
         */
        System.out.println(">> New class Implementation <<");
        MyIF obj1=new MyIFImp2();
        System.out.println(obj1.getNumber());
        System.out.println(obj1.getString());
    }
}
