//Exception Handling 
//A way of fixing the would be errors in java
//Try, Catch, Exception and Final
//Code may throw an exception

import java.util.*;

public class Except1{
    public static void main(String[] args) {
        try{
            //Code that might throw the exception
            //(Throws an arithmeticaException)
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the Divisor");
            int divisor = scanner.nextInt();
            double result = 10/divisor; 

            if(divisor == 10){
                throw new IllegalArgumentException("You can't divide a number by a 10");
            }
        }
        catch (NoSuchElementException e){
            System.out.println("No Exception caught : "+e.getMessage());
        }


        catch(Exception e){
            //catching a more general exception
            System.out.println("An exception occured: "+e.getMessage());
        }
    }

}
