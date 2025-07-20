package SelfLearningByHerbertSchildt.Chapter14.GeekForGeeks;


class Test1<T, V>{
    T obj1;
    V obj2;

    Test1(T obj1, V obj2){
        this.obj1=obj1;
        this.obj2=obj2;
    }

    public void print(){
        System.out.println(obj1);
        System.out.println(obj2);
    }
}

public class MultipleTypeParameter {
    public static void main(String[] args){
        Test1<Integer, String> obj=new Test1<>(13, "GeekForGeeks");
        obj.print();
        System.out.println();
    }
}
