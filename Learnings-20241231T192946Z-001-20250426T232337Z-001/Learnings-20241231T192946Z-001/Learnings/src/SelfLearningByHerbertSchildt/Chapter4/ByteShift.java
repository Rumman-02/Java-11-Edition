package SelfLearningByHerbertSchildt.Chapter4;


//Left shifting a byte value
public class ByteShift {
    public static void main(String[] args){
        byte a=64, b;
        int i;
        i=a<<2; //it will convert itself to "integer"
        b=(byte) (a<<2);
        System.out.println("Original value of a: "+a);
        System.out.println("i and b: "+i+" "+b);
    }
}
