package SelfLearningByHerbertSchildt.Chapter8.ChatGPtDisPatchAndSuper;

// Super class
class animal{
    String name;

    // Constructor
    animal(String name){
        this.name=name;
        System.out.println("Animal constructor called.");
    }

    // Method to be overridden
    void sound(){
        System.out.println("Some generic animal sound.");
    }
}


// Subclass
class Dog extends animal{

    Dog(String name){
        super(name);
        System.out.println( name +" constructor called.");
        System.out.println();
    }

    void sound(){
        super.sound();
        System.out.println(name+" says woff!");
    }
}

public class cGp1 {
    public static void main(String[] args){
        Dog d=new Dog("Buddy");
        d.sound();
    }
}
