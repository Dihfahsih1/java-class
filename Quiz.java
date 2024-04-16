import java.util.Scanner;

public class Quiz{

    public static void main(String[] args){

        Scanner inputdata = new Scanner(System.in);

        System.out.print("Enter your name please: ");
        String name = inputdata.nextLine();

        System.out.println(name);

        inputdata.close();
    }
}