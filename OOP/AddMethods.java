//Method in java adds new behavior or functionality within that class

import java.util.Scanner;

public class AddMethods{
    Scanner data= new Scanner(System.in);
    int num1;
    int num2;
    public AddMethods(int a, int b){
        this.num1=a;
        this.num2=b;
        

    }
    public int add(int a, int b){
        return a + b;
    }



    public void greeting(){
        System.out.println("Good afternoon");
    }

    public static void main(String[] args) {
        AddMethods obj= new AddMethods();
        obj.add();
        obj.greeting();
    }
}