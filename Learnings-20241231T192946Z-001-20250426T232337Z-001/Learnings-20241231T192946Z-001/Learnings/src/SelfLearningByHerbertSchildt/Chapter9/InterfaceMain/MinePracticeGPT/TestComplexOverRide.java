package SelfLearningByHerbertSchildt.Chapter9.InterfaceMain.MinePracticeGPT;

interface vehicle{
    void start();
    void stop();
}

abstract class car implements vehicle{

    @Override
    public void start(){
        System.out.println("Car is starting.");
    }
    // An abstract method
    abstract void fuelType();

    // Non-abstract method
    void service(){
        System.out.println("Car needs servicing.");
    }
}

class Electricar extends car{
    @Override
    public void fuelType(){
        System.out.println("Runs on electricity.");
    }

    public void stop(){
        System.out.println("Electric car stops.");
    }
}

public class TestComplexOverRide {
    public static void main(String[] args){
        vehicle v=new Electricar();
        v.stop();
        v.start();

        car myCar=new Electricar();
        myCar.service();

        Electricar e=new Electricar();
        e.fuelType();
    }
}
