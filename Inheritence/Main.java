class Person{
   
    protected String name;
    protected int age;
    protected double salary;

    protected Person(String n, int a, double salary){
        this.name=n;
        this.age=a;
        this.salary=salary;
        
    
    }
    
    protected void displayInfo(){
        System.out.println("Parent Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);

    }
}

class Student extends Person{
    private String name1;

    public Student(String name1, String name, int age, double salary){
        super(name,age,salary);
        this.name1=name1;

    }
    public void displayStudentInfo(){
        
        System.out.println("Child Name: "+name1);
        displayInfo();
    }
}

public class Main{
    public static void main(String[] args) {
        Student student1=new Student("John", "Doe", 20, 303.09);
        student1.displayStudentInfo();
    }
}
