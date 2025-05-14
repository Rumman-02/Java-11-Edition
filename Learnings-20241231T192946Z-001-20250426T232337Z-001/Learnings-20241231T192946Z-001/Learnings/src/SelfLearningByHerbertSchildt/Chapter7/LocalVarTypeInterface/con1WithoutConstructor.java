package SelfLearningByHerbertSchildt.Chapter7.LocalVarTypeInterface;

/*
    Convention1: here we will not use Constructor,
    as we will have (private instance variable)
 */


class MyClass{
    private int i;

    public void setI(int i){
        /*
        we have used same local variable name like instance variable
        we have used ""this"" method
         */
        if(i>=10){
            this.i=i;
        }
        else throw new RuntimeException("Number is not valid.");
    }
    int getI(){
        return i;
    }
}
public class con1WithoutConstructor {
    public static void main(String[] args){
        var mc=new MyClass();
        /*
        here, we have no constructor
        So there is no way to pass a value in objet section
         */

        mc.setI(5);
        System.out.println("value in mc is: "+mc.getI());

/*
mc2 will not work, as long as "mc" is on an exception, the complier
immediately suspends the program
 */

        var mc2=new MyClass();
        mc2.setI(25);
        System.out.println("Value in mc2: "+mc2.getI());
    }
}