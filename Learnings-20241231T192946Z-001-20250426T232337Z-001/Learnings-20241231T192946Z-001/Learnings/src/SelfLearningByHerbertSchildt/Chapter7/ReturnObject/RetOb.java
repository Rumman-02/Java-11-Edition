package SelfLearningByHerbertSchildt.Chapter7.ReturnObject;

//returning an object
class Test{
    int a; // The main val, will be used everywhere for the access

    //Constructor
    Test(int i){ // int (i:2) is passed here
        a=i; // here, a=2
    }

    Test incrByTen(){
        Test temp=new Test(a+10);
        return temp;
    }

//    int incrByTen(){
//        int temp=a+10;
//        return temp;
//    }
}

public class RetOb {
    public static void main(String[] args){
        Test ob1=new Test(2); //Calls Test(int 2)
        Test ob2;

        //ob2=ob1.incrByTen(); //ob2 is blank here
        System.out.println("ob1.a: "+ob1.a);//print 2,doesn't call any method>(incrByTen)

        ob2=ob1.incrByTen();
        System.out.println("ob2.a: "+ob2.a); // will print 12

        ob2=ob2.incrByTen(); // from previous, 12 is stored in ob2, now increment by 10
        System.out.println("ob2.a after second increase:"+ob2.a);
    }
}