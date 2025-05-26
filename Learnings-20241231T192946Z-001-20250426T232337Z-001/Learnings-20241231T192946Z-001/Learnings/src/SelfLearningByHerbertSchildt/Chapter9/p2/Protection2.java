package SelfLearningByHerbertSchildt.Chapter9.p2;

import SelfLearningByHerbertSchildt.Chapter9.p1.Protection;

class Protection2 extends Protection{
    Protection2(){
        System.out.println("Derived other package constructor");

        System.out.println("n_pro = "+n_pro);
        System.out.println("n_pub = "+n_pub);
    }
}
