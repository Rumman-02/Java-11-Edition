package SelfLearningByHerbertSchildt.Chapter9.p2;

import SelfLearningByHerbertSchildt.Chapter9.p1.Protection;

public class OtherPackage {
    OtherPackage(){
        Protection p=new Protection();
        //System.out.println("n = "+p.n);
        System.out.println("n_pub = "+p.n_pub);
    }
}
