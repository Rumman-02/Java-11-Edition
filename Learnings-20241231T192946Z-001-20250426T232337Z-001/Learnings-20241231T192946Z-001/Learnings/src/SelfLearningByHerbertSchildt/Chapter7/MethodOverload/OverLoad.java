package SelfLearningByHerbertSchildt.Chapter7.MethodOverload;

//Demonstrate method overloading
class overLoadDemo{
    void test(){
        System.out.println("No Parameter");
    }
    //Overload test for one integer parameter
    void test(int a){
        System.out.println("a: "+a);
    }
    // Overload test for two integer parameter
    void test(int a, int b){
        System.out.println("a and b: "+a+" and "+b);
    }
//    //Overload test for double parameter
//    void test(double a) {
//        double result = a * a;
//        System.out.println("Double value: " + result);
//    }

    //Overload test for double parameter
    double test(double a) {
        return a * a;
    }
}

public class OverLoad {
    public static void main(String[] args){
        overLoadDemo ob=new overLoadDemo();

        ob.test();
        ob.test(3);
        ob.test(3,5);
        double result=ob.test(15.36);
//        System.out.println("result of ob.test(15.36): "+(int) result);
        System.out.printf("result of ob.test(15.36):%.3f%n ", result);
    }
}
