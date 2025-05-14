package SelfLearningByHerbertSchildt.Chapter7.ArgumentPass;

//Objects are passed through their reference
class Test1{
    int a,b;

    Test1(int i, int j){
        a=i;
        b=j;
    }
    // Pass an object
    void meth(Test1 o){
        o.a*=2;
        o.b/=2;
    }
}

public class PassObjReference {
    public static void main(String[] args){
        Test1 ob=new Test1(10,15);
        System.out.println("ob.a and ob.b before call: "+ob.a +" and "+ob.b);
        ob.meth(ob);
        System.out.println("ob.a and ob.b after call: "+ob.a +" and "+ob.b);
    }
}
