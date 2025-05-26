package SelfLearningByHerbertSchildt.Chapter9.p1;

class SamePackage { // Class is package-private
    SamePackage() {
        Protection p = new Protection();
        System.out.println("Same Package constructor ");
        System.out.println("n = " + p.n); // Accessible: package-private member in same package
        // System.out.println("n_pri = "+p.n_pri); // ERROR: private member, not accessible here
        System.out.println("n_pro: " + p.n_pro); // Accessible: protected member in same package
        System.out.println("n_pub: " + p.n_pub); // Accessible: public member
    }
}