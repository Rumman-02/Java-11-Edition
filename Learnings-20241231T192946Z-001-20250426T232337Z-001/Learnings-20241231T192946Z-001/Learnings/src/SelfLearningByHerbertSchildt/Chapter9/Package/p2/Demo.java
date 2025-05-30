package SelfLearningByHerbertSchildt.Chapter9.Package.p2;

public class Demo {
    public static void main(String[] args){
        Protection2 ob1=new Protection2();
        OtherPackage ob2=new OtherPackage();
    }

    static class Protection2 extends SelfLearningByHerbertSchildt.Chapter9.Package.p1.Demo.Protection {
        Protection2(){
            System.out.println("Derived other package constructor");

            System.out.println("n_pro = "+n_pro);
            System.out.println("n_pub = "+n_pub);
        }
    }

    public static class OtherPackage {
        OtherPackage(){
            SelfLearningByHerbertSchildt.Chapter9.Package.p1.Demo.Protection p=new SelfLearningByHerbertSchildt.Chapter9.Package.p1.Demo.Protection();
            //System.out.println("n = "+p.n);
            System.out.println("n_pub = "+p.n_pub);
        }
    }
}
