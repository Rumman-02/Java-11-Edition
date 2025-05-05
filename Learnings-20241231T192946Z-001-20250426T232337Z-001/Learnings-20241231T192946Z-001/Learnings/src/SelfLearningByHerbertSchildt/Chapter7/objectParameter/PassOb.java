package SelfLearningByHerbertSchildt.Chapter7.objectParameter;

// Objects may be passed to methods
class Test{
    int a,b;
    Test(int i, int j){
        a=i;
        b=j;
    }
    boolean equalTo(Test o){
        return o.a == a && o.b == b;
    }
}
public class PassOb {
    public static void main(String[] args){
        Test ob1=new Test(10,20);
        Test ob2=new Test(10,20);
        Test ob3=new Test(-11,19);
        System.out.println("Comparison between first and second: "+ob1.equalTo(ob2));
        System.out.println("Comparison between second and third: "+ob2.equalTo(ob3));
    }
}
