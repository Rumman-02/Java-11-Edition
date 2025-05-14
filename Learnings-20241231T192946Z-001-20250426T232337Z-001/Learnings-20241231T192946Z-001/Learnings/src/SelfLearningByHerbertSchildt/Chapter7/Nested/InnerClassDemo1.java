package SelfLearningByHerbertSchildt.Chapter7.Nested;

//Define an inner class within a for loop
class Outer1{
    int outer_x=100;

    void test(){
        for(int i=0;i<10;i++) {
            class Inner {
                void display() {
                    System.out.println(" display: outer_x: " + outer_x);
                }
            }

            Inner inner1 = new Inner();
            inner1.display();
        }
    }
}


public class InnerClassDemo1 {
    public static void main(String[] args){
        Outer1 out=new Outer1();
        out.test();
    }
}
