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
        System.out.println("A person speaks");
    }

    public void greet(){
        
        //Prompt the user fo the input
        System.out.print("Enter your Name: ");
        name = scanner.nextLine();
        System.out.print("Enter your Age: ");
        age = scanner.nextInt();
        System.out.println("Hello, your name is: "+name +" and you are: "+ age+"Years old");
        scanner.close();
    }
    //Main Method
    public static void main(String[] args){
        Person person = new Person("",0);
        person.greet(); //call the greet method to input name and age
        person.speak();
    }
}

