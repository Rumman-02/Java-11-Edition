package SelfLearningByHerbertSchildt.Chapter3;

// Compute distance light travels using long variables

public class Light {
    public static void main(String[] args){
        int lightSpeed; //32-bit
        long days; //64-bit
        long seconds;
        long distance;

        //Approximate speed of light in miles per second
        lightSpeed=186000;
        days=1000; //Specify number of the days
        seconds=days*24*60*60; // Convert to seconds
        distance=lightSpeed*seconds; //Compute distance
        System.out.print("In "+ days);
        System.out.print(" days light will travel about ");
        System.out.print(distance+" miles.");

    }
}
