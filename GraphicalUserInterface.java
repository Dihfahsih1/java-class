import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GraphicalUserInterface {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple GUI Example");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String Name = scanner.nextLine();

        JLabel label = new JLabel("Hello, World");
        JButton button = new JButton("Click Me");

        frame.getContentPane().add(button);


        frame.setSize(300, 200);

        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
    
}
