package SelfLearningByHerbertSchildt.Chapter7.ArgumentPass;

// Primitive types are passed by value
class Test{
    void meth(int i, int j){
        i*=2;
        j/=2;
    }
}

public class CallByValue {
    public static void main(String[] args){
        Test ob=new Test(); // Test( is called as default constructor)
         int a=15, b=20;
         System.out.println("a and b before call+ "+a+" and "+b);
         ob.meth(a,b);
         System.out.println("a and b after call: "+a+" and "+b);
    }
}
