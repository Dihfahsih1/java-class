import java.util.Scanner;

public class Person{
    Scanner scanner = new Scanner(System.in);
    //fields
    //these are parameters passed to a class Person
    private String name;
    private int age;

    //constructors

    public Person(){
        age=100;
    }
    public Person(String n1){
        this.name=n1;
    }

    public Person(int i){
        this.age=i;
    }
    public Person(String n, int a){
        //setting the parameters passed to the class fields
       this.name = n;
       this.age = a;
    }


    // method to greet a user
    public void speak(){
        int age = 25;
        String name = "John";
        System.out.printf("Hello, %s! You are %d years old.\n", name, age);

    }

    public void greet(){
        
        //Prompt the user fo the input
        
        System.out.print("Enter your Age: ");
        age = scanner.nextInt();

        System.out.print("Enter your Name: ");
        name = scanner.nextLine();
        System.out.printf("Hello, your name is %s and you are %d\n",name,age);
        scanner.close();
    }
    //Main Method
    public static void main(String[] args){
        Person personempty = new Person();
        System.out.println("Set age in the constructor:"+ personempty.age);
        Person personage = new Person(30);

        personage.greet(); //call the greet method to input name and age
        personage.speak();
    }
}

