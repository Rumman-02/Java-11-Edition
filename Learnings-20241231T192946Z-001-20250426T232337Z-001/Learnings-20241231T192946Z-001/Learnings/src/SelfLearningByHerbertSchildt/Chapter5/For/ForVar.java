package SelfLearningByHerbertSchildt.Chapter5.For;

// Parts of the for loop can be empty.

public class ForVar {
    public static void main(String[] args){
        int i;
        boolean done=false;
        i=0;

        for( ; !done; ){ // done is "false", and it will iterate till "true"
            // for will accept only "true" and ot will break

            System.out.println("i is "+i);
            if(i==10) done=true;
            i++;
        }
    }
}
