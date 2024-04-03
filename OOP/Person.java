import java.util.Scanner;

public class Person{
    Scanner scanner = new Scanner(System.in);
    //fields
    //these are parameters passed to a class Person
    private String name;
    private int age;

    //constructor
    public Person(String name, int age){
        //setting the parameters passed to the class fields
       this.name = name;
       this.age = age;
    }
    // method to greet a user
    public void speak(){
        int age = 25;
        String name = "John";
        System.out.printf("Hello, %s! You are %d years old.\n", name, age);

    }

    public void greet(){
        
        //Prompt the user fo the input
        System.out.print("Enter your Name: ");
        name = scanner.nextLine();
        System.out.print("Enter your Age: ");
        age = scanner.nextInt();
        System.out.printf("Hello, your name is %s and you are %d\n",name,age);
        scanner.close();
    }
    //Main Method
    public static void main(String[] args){
        Person person = new Person("",0);
        person.greet(); //call the greet method to input name and age
        person.speak();
    }
}

