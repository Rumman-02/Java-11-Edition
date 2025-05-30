package SelfLearningByHerbertSchildt.Chapter9.Package.p1;

public class Demo {
    public static void main(String[] args) {
        Protection ob1 = new Protection();
        Derived ob2 = new Derived();
        SamePackage ob3 = new SamePackage();
    }

    static class Derived extends Protection { // Class is package-private
        Derived() {
            System.out.println("derived Constructor");
            System.out.println("n: " + n); // Accessible: package-private member in same package

            // Class only
            // System.out.println("n_pri = "+4+n_pri); // ERROR: private member, not accessible here
            System.out.println("n_pro: " + n_pro); // Accessible: protected member in subclass
            System.out.println("n_pub: " + n_pub); // Accessible: public member
        }
    }

    public static class Protection {
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

    static class SamePackage { // Class is package-private
        SamePackage() {
            Protection p = new Protection();
            System.out.println("Same Package constructor ");
            System.out.println("n = " + p.n); // Accessible: package-private member in same package
            // System.out.println("n_pri = "+p.n_pri); // ERROR: private member, not accessible here
            System.out.println("n_pro: " + p.n_pro); // Accessible: protected member in same package
            System.out.println("n_pub: " + p.n_pub); // Accessible: public member
        }
    }
}