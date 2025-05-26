package SelfLearningByHerbertSchildt.Chapter8.ChatGptSuper;

/*
Person(superclass) and Employee(subClass)
 */
class Person{
    private String name;
    private int age;

    // Constructor
    Person(String name, int age){
        this.age=age;
        this.name=name;
    }

    /*
    These two methods (getName) and (getAge) are for visibility
     */
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }

    void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}


// SubClass
class Employee extends Person{
    private String department;
    private double salary;

    Employee(String name, int age, String department, double salary){
        super(name,age);
        this.department=department;
        this.salary=salary;
    }

    void DisplayEmployeeInfo(){
        System.out.println("=== Employee Information ===");
        System.out.println("Name: "+getName());
        System.out.println("Age :"+getAge());
        System.out.println("Salary: "+salary);
        System.out.println("Department: "+department);
    }

    // Another method only in subClass
    double AnnualSalary(){
        return salary*12;
    }
}

public class pWithSuper {
    public static void main(String[] args){
        /*
        For subClass
         */
        Employee emp=new Employee("Alice",30,"IT",50000);
        emp.DisplayEmployeeInfo();
        System.out.println("Annual Salary of that employee: "+emp.AnnualSalary());
        System.out.println();
        /*
        For superClass
         */
        Person p1=new Person("Goru",176);
        System.out.println("Values frm the superclass>");
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        p1.displayInfo();
    }
}
