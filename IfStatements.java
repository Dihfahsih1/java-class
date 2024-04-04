import java.util.Scanner;

public class IfStatements{
    
    
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        int y = userinput.nextInt();
        if(y%2==0){
            System.out.printf("%d is an even Number",y);
        }
        else{
            System.out.printf("%d is an old Number",y);
        }
        userinput.close();
    }
}