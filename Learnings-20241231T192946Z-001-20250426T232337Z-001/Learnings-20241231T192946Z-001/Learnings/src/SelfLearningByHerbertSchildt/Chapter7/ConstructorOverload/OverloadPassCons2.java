package SelfLearningByHerbertSchildt.Chapter7.ConstructorOverload;

// Here box allows one object ot initialize another
class Box6{
    double height;
    double width;
    double depth;

    // Constructor used when all the dimensions specified
    Box6(double a, double b, double c){
        height=a;
        width=b;
        depth=c;
    }

    // Constructor takes an object of type Box
    Box6(Box6 ob){
        height= ob.height;
        width=ob.width;
        depth=ob.depth;
    }
    Box6(){
        height=-1;
        width=-1;
        depth=-1;
    }
    Box6(double len){
        //width=height=depth=len;
        double vo=len*len;
        System.out.println("volume of cube: "+vo);
    }
    double volume(){
        return height*width*depth;
    }
}

public class OverloadPassCons2 {
    public static void main(String[] args){
        Box6 m1=new Box6(10,20,15);
        Box6 m2=new Box6();
        Box6 m3=new Box6(7);

        Box6 myClone=new Box6(m1);

        double vol=m1.volume();
        System.out.println("volume of m1: "+vol);

        vol=m2.volume();
        System.out.println("Volume of m2: "+vol);

        m3.volume();
//        vol=m3.volume();
//        System.out.println("Volume of m3: "+vol);

        vol=myClone.volume();
        System.out.println(vol);
    }
}
