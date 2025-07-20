package SelfLearningByHerbertSchildt.Chapter14.GeekForGeeks;

// Java Program to show working of user defined genric class

class Test<T>{

    // obj > an object of type T is declared
    T obj;

    public Test(T obj){
        this.obj=obj;
    }

    public T getObj() {
        return obj;
    }
}

// Driver class to test above
public class GenericIntro {
    public static void main(String[] args){


        // Instance of Integer type

        Test<Integer> iobj=new Test<>(15);
        System.out.println(iobj.getObj());

        // Instance of String type

        Test<String> sObj=new Test<>("GeekforGeeks");
        System.out.println(sObj.getObj());
        System.out.println();
    }

}
