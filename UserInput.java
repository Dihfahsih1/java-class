import java.util.Scanner;
public class UserInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        

        System.out.print("Enter your Age: ");
        int age = scanner.nextInt();


        System.out.println("Your Name is: " + name + "and\n\t you are : "+age +" years old");
        scanner.close();
    }
}
