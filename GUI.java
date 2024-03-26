import javax.swing.JOptionPane;
public class GUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter Your name");
        
        Integer age= Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        Double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Your Height"));

        JOptionPane.showMessageDialog(null, "Hello "+name+ "You are: "+age+" years old and your height is: "+height);
    }
}
