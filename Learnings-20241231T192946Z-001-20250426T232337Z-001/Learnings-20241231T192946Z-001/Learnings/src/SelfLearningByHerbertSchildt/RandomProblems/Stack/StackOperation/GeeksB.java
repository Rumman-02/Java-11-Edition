package SelfLearningByHerbertSchildt.RandomProblems.Stack.StackOperation;

class stackOperation{
    int[] stck=new int[10];
    int index=-1;

    int push(int item){
        if(index>10){
            System.out.println("Stack overflow");
            return 0;
        }
        else return stck[++index]=item;
    }

    int pop(){
        if (index<0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            return stck[index--];
        }
    }
//
//    int peek(){
//
//    }
}


public class GeeksB {
    public static void main(String[] args){
        stackOperation st=new stackOperation();


        // Push Operation
        System.out.println("Push Operation");
        for(int i=0;i<10;i++){
            System.out.println(st.push(i));
        }
    }
}
