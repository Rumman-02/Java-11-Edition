package SelfLearningByHerbertSchildt.Chapter5.ForEach.MultiDimension;


//Use for-each style for on a two-dimensional array
public class ForEach3 {
    public static void main(String[] args){
        int sum=0;
        int [][] nums= new int[3][5];

        //give nums some value
        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                nums[i][j]=(i+1)*(j+1);
            }
        }
        //Use for-each for to display and sum the values
        for(int x[]:nums){ // iterates evey row of the array named nums[] as x[]
            for(int y:x){ // for current row, y iterates through every element of x[] row
                System.out.println("value is: "+y);
                sum+=y;
            }
        }
        System.out.println("\nSummation is: "+sum);
    }
}
