import java.util.Scanner;

public class Grade {
    
    public static void main(String[] args) {
      System.out.println("Enter the grade"); 
      Scanner gradeinput = new Scanner(System.in);
      String grade = "D";
//it does not support range based cases or conditions
      switch(grade){
        case "A":
        case "a":
            System.out.println("Excellent");
            break;
        case "B": 
        case "b":
            System.out.println("Good");
            break;

        case "C": 
            System.out.println("Fair");
            break;
      }

      gradeinput.close();

    }
}


