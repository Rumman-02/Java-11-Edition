package SelfLearningByHerbertSchildt.Chapter9.InterfaceMain.InterfaceExtend;

/*
An interface can also implement another interface, by using the word "" >> extends << ""
 */

interface A{
    // One interface can extend another
    void meth1();
    void meth2();
}

/*
B now includes both meth1() and meth2()
 */
interface B extends A{
    void meth3();
}

/*
This class implements both A and B
 */
class Myclass implements B {
    public void meth1() {
        System.out.println("Implement of meth1().");
    }

    public void meth2() {
        System.out.println("Implement of meth2()");
    }

    public void meth3() {
        System.out.println("Implement of meth3()");

    }
}

public class IfExtend {
    public static  void main(String[] args) {
        Myclass ob=new Myclass();
        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}