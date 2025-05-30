package SelfLearningByHerbertSchildt.Chapter7.Nested;

// Demonstrate an inner class
class Outer{
    int outer_x=100;

    void test(){
        Inner inner=new Inner();
        inner.display();
    }

    // This is an inner class
    class Inner{
        void display(){
            System.out.println("display: outer_x = "+outer_x);
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args){
        Outer outer=new Outer();
        outer.test();
    }
}
