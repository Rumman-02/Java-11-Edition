package SelfLearningByHerbertSchildt.Chapter9.InterfaceMain.NestedInterface;

// Thi class contains a nested interface
class A{

    // this is a nested interface
    public interface NestedIF{
        boolean isNotNegative(int x);
    }
}

class B implements A.NestedIF{
    public boolean isNotNegative(int x){
        return x<0 ? true: false;
    }
}

public class nestedIFDemo {
    public static void main(String[] args){
        A.NestedIF nif=new B();

//        boolean a=nif.isNotNegative(12);
//        System.out.println(a);

        System.out.println();

        if(nif.isNotNegative(14)) System.out.println("Number is not negative.");
        if(nif.isNotNegative(-11)) System.out.println("It will not be shown.");
    }
}
