import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCal{
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Use absolute positioning

        // Create components
        JLabel numLabel1 = new JLabel("Number 1:");
        numLabel1.setBounds(20, 20, 80, 25);
        JTextField numField1 = new JTextField();
        numField1.setBounds(100, 20, 150, 25);
        JLabel numLabel2 = new JLabel("Number 2:");
        numLabel2.setBounds(20, 50, 80, 25);
        JTextField numField2 = new JTextField();
        numField2.setBounds(100, 50, 150, 25);
        JButton addButton = new JButton("Add");
        addButton.setBounds(20, 80, 80, 25);
        JButton subButton = new JButton("Sub");
        subButton.setBounds(100, 80, 80, 25);
        JButton multButton = new JButton("Mult");
        multButton.setBounds(180, 80, 80, 25);
        JButton divButton = new JButton("Div");
        divButton.setBounds(260, 80, 80, 25);
        JLabel resultLabel = new JLabel();
        resultLabel.setBounds(20, 110, 250, 25);

        // Add components to the frame
        frame.add(numLabel1);
        frame.add(numField1);
        frame.add(numLabel2);
        frame.add(numField2);
        frame.add(addButton);
        frame.add(subButton);
        frame.add(multButton);
        frame.add(divButton);
        frame.add(resultLabel);

        // Add action listener to the buttons
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation(numField1, numField2, '+', resultLabel);
            }
        });

        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation(numField1, numField2, '-', resultLabel);
            }
        });

        multButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation(numField1, numField2, '*', resultLabel);
            }
        });

        divButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation(numField1, numField2, '/', resultLabel);
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }

    private static void performOperation(JTextField numField1, JTextField numField2, char operation, JLabel resultLabel) {
        try {
            // Get input from text fields
            double num1 = Double.parseDouble(numField1.getText());
            double num2 = Double.parseDouble(numField2.getText());
            double result;

            // Perform operation based on the selected operation
            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        resultLabel.setText("Cannot divide by zero");
                        return;
                    }
                    break;
                default:
                    resultLabel.setText("Invalid operation");
                    return;
            }

            // Display result
            resultLabel.setText("Result: " + result);
        } catch (NumberFormatException ex) {
            // Handle non-numeric input
            resultLabel.setText("Invalid input");
        }
    }
}