package SelfLearningByHerbertSchildt.Chapter8.Super;

class catoon {
    private int he;
    private int wi;
    private int de;


    catoon(int a, int b, int c){
      he=a;
      wi=b;
      de=c;
    }

    // Cloned constructor
    catoon(catoon boxi){
        he=boxi.he;
        wi=boxi.wi;
        de= boxi.de;
    }

    // for cube
    catoon(int len){
        he=wi=de=len;
    }

    double vol(){
        return he*wi*de;
    }
}

class superPrac1 extends catoon{
    int we;

    superPrac1(superPrac1 ob){
        super(ob);
        we=ob.we;
    }

    superPrac1(int a, int b, int c, int d){
        super(a,b,c);
        d=we;
    }

    // Cube
    superPrac1(int len, int d){
        super(len);
        we=d;
    }
}


public class superPrac {
    public static void main(String[] args){
        superPrac1 sp1=new superPrac1(1,2,3,4);
        double v1_all=sp1.vol();
        System.out.println("when all the parameters are alive at the subClass: "+v1_all);

        superPrac1 sp2=new superPrac1(3,1);
        double v2=sp2.vol();
        System.out.println("When there is cube in the subclass: "+v2);
        System.out.println("Another parameter in the subclass of cube:");
        System.out.println(sp2.we);
    }
}
