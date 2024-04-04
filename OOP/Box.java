//constructor overloading

public class Box{
    double length;
    double width;
    double height;

    //default constructor
    public Box(){
        length=1.0;
        width=1.0;
        height=1.0;

    }

    //parameterized Constructor
    public Box(double l, double w, double h){
        this.length=l;
        this.width=w;
        this.height=h;
    }

    //method to calculate the area of the box
    public double calculateArea(){
        return 2*((length*width) +(length*height) +(width*height));

    }

    public double calculatePerimeter(){
        return 4*(length + width + height);
    }
    public static void main(String[] args){
        //Creating instances of a box or objects from a box class
        Box box2 = new Box();
        Box box1 = new Box(2.0,3.0,4.0);

        //Calculating area and perimeter of box1 object
        double area1 =box1.calculateArea();
        double perimeter1 =box1.calculatePerimeter();
        System.out.printf("Area of box1 object:%f\n", area1);
        System.out.printf("Perimeter of box1 object:%f\n", perimeter1);
    }
}