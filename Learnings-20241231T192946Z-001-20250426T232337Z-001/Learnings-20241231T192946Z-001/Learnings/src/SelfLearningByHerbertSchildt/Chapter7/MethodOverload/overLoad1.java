package SelfLearningByHerbertSchildt.Chapter7.MethodOverload;

//Automatic type conversions apply to overloading
class OverLoadDemo1{
    void test(){
        System.out.println("No parameters.");
    }
    // Overload test for two parameters
    void test(int a, int b){
        System.out.println("a and b: "+ a+" "+b);
    }
    // Overload test for double parameters
    void test(double a){
        System.out.println("Inside test (double) a: "+a);
    }
}
public class overLoad1 {
    public static void main(String[] args){
        OverLoadDemo1 ob=new OverLoadDemo1();
        int i =88;

        ob.test();
        ob.test(10,20);
        ob.test(i);// This will invoke test(double)
        ob.test(123.2); // This will invoke test(double)
    }
}
