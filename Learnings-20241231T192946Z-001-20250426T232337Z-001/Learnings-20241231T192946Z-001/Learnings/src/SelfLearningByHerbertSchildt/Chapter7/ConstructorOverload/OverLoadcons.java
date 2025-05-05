package SelfLearningByHerbertSchildt.Chapter7.ConstructorOverload;

/*
here, Box defines three constructors to initialize
 the dimensions of a box in various ways
 */
class Box5{
    double height;
    double width;
    double depth;

    Box5(double height, double width, double depth){
        this.height=height;
        this.width=width;
        this.depth=depth;
    }
    Box5(){
        height=-1;
        width=-1;
        depth=-1;
    }
    Box5(double len){
        height=width=depth=len;
    }
    double vol(){
        double volume=height*width*depth;
        return volume;

    }
}

public class OverLoadcons{
    public static void main(String[] args){
        Box5 m1=new Box5(10,20,15);
        Box5 m2=new Box5();
        Box5 m3=new Box5(12.22);

        double vol1, vol2,vol3;

       vol1=m1.vol();
       System.out.println(vol1);
       vol2=m2.vol();
        System.out.println(vol2);
       vol3=m3.vol();
        System.out.println(vol3);
    }
}



//class Box5{
//    double height;
//    double width;
//    double depth;
//
//    void boxa(double height, double width , double depth){
//        this.height=height;
//        this.width=width;
//        this.depth=depth;
//    }
//    void boxb(){
//        height=-1;
//        width=-1;
//        depth=-1;
//    }
//    void boxc(double len){
//        height=width=depth=len;
//    }
//    double volume(){
//        return height*width*depth;
//    }
//}
//
//public class OverLoadCons {
//    public static void main(String[] args){
//        Box5 m1=new Box5();
//        Box5 m2=new Box5();
//        Box5 m3=new Box5();
//
//        double vol;
//
//        m1.boxa(10.1,20.3,15.0);
//        vol= m1.volume();
//        System.out.println(vol);
//
//        m2.boxc(13.22);
//        vol=m2.volume();
//        System.out.println(vol);
//
//        m3.boxb();
//        vol=m3.volume();
//        System.out.println(vol);
//
//    }
//}
