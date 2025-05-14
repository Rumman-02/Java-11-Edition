package SelfLearningByHerbertSchildt.Chapter7.objectParameter;

class boxN{
    int height;
    int width;

    boxN(int i, int j){
        height=i;
        width=j;
    }
    void convert(boxN NewBox){
        height= NewBox.height;
        width= NewBox.width;
    }
    int sum(){
        return height+width;
    }
}

public class CopyObj {
    public static void main(String[] args){
        boxN mBox=new boxN(3,6);
        boxN nBox=new boxN(7,9);
        System.out.println(mBox.height+" and "+mBox.width);
        mBox.convert(nBox);
        System.out.println(mBox.sum());

    }
}
