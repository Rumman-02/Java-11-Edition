package SelfLearningByHerbertSchildt.Chapter8.Super;

// Using super to overcome name hiding
class A {
    int i;
}

// create a subclass by extending class A
class B extends A{
    int i;

    B(int a, int b){
        super.i=a; // i in A
        i=b;
    }

    void show(){
        System.out.println("i in superClass: "+super.i);
        System.out.println("i in subClass: "+i);
    }
}

class UseSuper {
    public static void main(String[] ignoredArgs){
        B subOb=new B(1,2);
        subOb.show();
    }
}
