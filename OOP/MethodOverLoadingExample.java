public class MethodOverLoadingExample{
    public void display(){
        System.out.println("No parameters");
    }

    public void display(String message){
        System.out.println("Message: "+message);
    }

    public void print(int num){
        System.out.println("Interger: "+num);
    }

    public void print(double num){
        System.out.println("Double: "+num);
    }

    public void show(int count, String message){
        System.out.println("Count: "+count + ", Message: "+message);
    }

    public void show(String message, int count){
        System.out.println("Double: "+num);
    }



}