package SelfLearningByHerbertSchildt.Chapter4;


//Left shifting as a quick way to multiply by two
public class MultByTwo {
    public static void main(String[] args){
        int num=0xFFFFFFE;
        for(int i=0;i<4;i++){
            num=num<<1;
            System.out.println(num);
        }
    }
}
