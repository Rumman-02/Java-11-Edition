package SelfLearningByHerbertSchildt.Chapter9.p1;

public class Protection {
    int n = 1; // Default (package-private) access
    private int n_pri = 2; // Private access
    protected int n_pro = 3; // Protected access
    public int n_pub = 4; // Public access

    public Protection() { // Constructor should be public or package-private for external instantiation
        System.out.println("Base Constructor");
        System.out.println("n= " + n);
        System.out.println("n_pri: " + n_pri);
        System.out.println("n_pro: " + n_pro);
        System.out.println("n_pub: " + n_pub);
    }
}