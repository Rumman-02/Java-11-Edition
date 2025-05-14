package SelfLearningByHerbertSchildt.Chapter7.LocalVarTypeInterface;
/*
In here, we will use the constructor
and will have a private instance variable
 */

class MyClass1{
    private int i;
    MyClass1(int k){
        i=k;
    }
    void setI(int k){
        if(k>=0){
            i=k;
        }
    }
    int getI(){
        return i;
    }
}

public class Con2WithConstructor {
    public static void main(String[] args){
        var mc1=new MyClass1(15);
        System.out.println("Value of i in mc1: "+mc1.getI());
        /*
        here if we have to pass a new value we can use the object mc1
        as we have declared an object, so need for redundancy to create a
        new object
         */
        mc1.setI(55);
        System.out.println("New value of i in mc1: "+mc1.getI());


/*
This part is redundant, as we have a prior object "mc1", so we do not need a
new object to print a new value

        var mc2=new MyClass1(55);
        // We have created a new object named "mc2"
        System.out.println("Value of i in mc2: "+mc2.getI());
 */

    }
}
