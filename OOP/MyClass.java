public class MyClass{
    String name;
    int age;
    //constructor
    public MyClass(String n, int a){
        this.name=n;
        this.age=a;
        System.out.println("The contructor was called");
    }

    //Main Method
    public static void main(String[] args){
        //creating objects from MyClass
        MyClass obj = new MyClass("John", 20);

    }
}

