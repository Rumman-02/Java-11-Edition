package SelfLearningByHerbertSchildt.RandomProblems;



abstract class car{
    String CompanyName;
    String CompanyFounder;
    String CarModel;
    String EngineDetails;
    int Generated_HP;
    String ChesisCode;
    String ColorCode;

        car(String cName, String c_founder, String c_model, String e_details, int hp, String c_code, String color){
            CompanyName=cName;
            CompanyFounder=c_founder;
            CarModel=c_model;
            EngineDetails=e_details;
            Generated_HP=hp;
            ChesisCode=c_code;
            ColorCode=color;
        }

        abstract void showDetails();
}

class Mazda extends car{
    public Mazda(){
        super("Mazda", "Hiroshi", "8732-A", "3.2L-V6", 826, "2876-44A", "AAAA");
    }
    @Override
    void showDetails(){
        System.out.println("Company Name: "+CompanyName);
        System.out.println("Company Founder: "+CompanyFounder);
        System.out.println("Car Model: "+CarModel);
        System.out.println("Engine Details: "+EngineDetails);
        System.out.println("Total HP: "+Generated_HP);
        System.out.println("Chasis Number: "+ChesisCode);
        System.out.println("Color Code: "+ColorCode);
    }
}


public class CarInventory {
    public static void main(String[] args){
        Mazda m=new Mazda();
        m.showDetails();
    }
}
