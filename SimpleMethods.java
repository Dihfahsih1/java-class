public class SimpleMethods{
    //accessor/modifier type name = value
    public int age;
    public double salary;
    public String name;

    //constructor
   
    public SimpleMethods(int a){
        this.age=a;
    }

    public SimpleMethods(double s, String n){
        this.salary=s;
        this.name=n;
    }

    public void method1(int ages){
        System.out.println("You are: " +ages+" Years old");
    }

    public void method1(double money, String n1){
        System.out.println("Your name is: " +n1+" and your salary is: "+money);
    }
    public static void main(String[] args) {
        SimpleMethods age_obj = new SimpleMethods(0);
        //A class then object then new key word to invoke the constructor
        SimpleMethods salary_and_name= new SimpleMethods(0.0,"");

        age_obj.method1(26);
        salary_and_name.method1(239.08,"sam");
    
}

}