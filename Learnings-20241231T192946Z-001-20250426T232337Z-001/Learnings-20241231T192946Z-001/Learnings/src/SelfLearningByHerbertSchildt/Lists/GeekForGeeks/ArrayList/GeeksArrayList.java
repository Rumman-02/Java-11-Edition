package SelfLearningByHerbertSchildt.Lists.GeekForGeeks.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class GeeksArrayList {
    public static void main(String[] args){

        int n=5;
        List<Integer> arrli=new ArrayList<>(n);

        for(int i=1;i<=n;i++)
            arrli.add(i);

        System.out.println(arrli);

        arrli.remove(3);

        System.out.println(arrli);

        for(int i=0;i<arrli.size();i++)
            System.out.print(arrli.get(i)+" ");

    System.out.println();
    }
}
