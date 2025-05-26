package SelfLearningByHerbertSchildt.Chapter8.ChatGptSuper;

//SuperClass
class Person1{
    private String name;
    private int age;

    void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }

    void setAge(int age){
        this.age=age;
    }
    int getAge(){
        return age;
    }

    void viewDetails(){
        System.out.println("Name is:" +name);
        System.out.println("Age is: "+ age);
    }
}

// SubClass
class Employee1 extends Person1{
     private String department;
     private double salary;

     Employee1(String department, double salary){
         this.department=department;
         this.salary=salary;
     }

     void setEmployeeDetails(String name, int age){
         setName(name);
         setAge(age);
     }
     void details(){
         System.out.println("=== Employee Information ===");
         System.out.println("Name: "+getName());
         System.out.println("Age: "+getAge());
         System.out.println("Department: "+department);
         System.out.println("Salary: "+ salary);
     }
}

public class pWithoutSuper {


    public static void main(String[ ] args){
        Employee1 e1=new Employee1("CSE",200);
        e1.setEmployeeDetails("Amber",12);
        e1.details();
        e1.viewDetails();
    }
}
