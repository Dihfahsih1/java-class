import javax.swing.*;

public class SimpleGUIExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple GUI Example");

        JLabel label = new JLabel("Hello, World");

        frame.getContentPane().add(label);

        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}
