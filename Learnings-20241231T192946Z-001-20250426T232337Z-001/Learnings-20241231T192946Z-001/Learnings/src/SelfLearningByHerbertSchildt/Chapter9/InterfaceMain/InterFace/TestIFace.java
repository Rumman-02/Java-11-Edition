package SelfLearningByHerbertSchildt.Chapter9.InterfaceMain.InterFace;

// Declaring the interface
interface Callback{
    void callback(int pram);
}

// Implementing the interface class
class Client implements Callback{

    /*
    callback(int p) called with public access modifier
     */
    public void callback(int p){
        System.out.println("Callback  called with: "+p);
    }

    void nonIfaceMeth(){
        System.out.println("Classes that implements interfaces "+" may also define other members, too!");
    }
}

public class TestIFace {
    public static void main(String[] args){
        Client c=new Client();
        c.callback(42);
        //Client d=new Client();
        c.nonIfaceMeth();
    }
}

// Declaring the interface
interface Callback2{
    void callback(int pram);
}

// Another implementation of callBack
class AnotherClient implements Callback2, Callback {
    // Implement AnotherClient CallBack's interface
    public void callback(int p){
        System.out.println("Another version of callback.");
        System.out.println("p squared is: "+(p*p));
    }
}

class TestIface2 {
    public static void main(String[] args){
        Callback c=new Client();
        AnotherClient ob=new AnotherClient();
        c.callback(42);
        c=ob;
        c.callback(42);

    }
}
