package SelfLearningByHerbertSchildt.Chapter9.p1;

class Derived extends Protection { // Class is package-private
    Derived() {
        System.out.println("derived Constructor");
        System.out.println("n: " + n); // Accessible: package-private member in same package

        // Class only
        // System.out.println("n_pri = "+4+n_pri); // ERROR: private member, not accessible here
        System.out.println("n_pro: " + n_pro); // Accessible: protected member in subclass
        System.out.println("n_pub: " + n_pub); // Accessible: public member
    }
}