import java.util.Scanner;

public class TriangleHypotunes {
    public static void main(String[] args) {
        double x;
        double y;
        double z;

        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter The value of X: ");
        x = scanner.nextDouble();

        System.out.println("Enter The value of Y: ");
        y = scanner.nextDouble();
        z = Math.sqrt((x*x)+(y*y));
        
        System.out.println("The hypotunes of the triangle is: " +z);
        scanner.close();
    }
    
}
