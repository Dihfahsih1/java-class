import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your the value of I: ");
        int i = scanner.nextInt();

        System.out.print("Enter the conditional value: ");
        int cond = scanner.nextInt();

        while(i <=cond){ //while loop executes when the condition is only true
            System.out.println(i);
            i++;//Incrementing the value of i
        }
    }
}
