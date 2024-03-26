import java.util.Scanner;

public class TriangleHypotunes {
    public static void main(String[] args){
        double h;
        double b;
        double hy;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Height: ");
        h=scanner.nextDouble();

        System.out.println("Enter the Base: ");
        b=scanner.nextDouble();

        hy =Math.sqrt((h*h) + (b*b));

        System.out.println("The hypotunes side is:  " +hy);
        scanner.close();
    }
}
