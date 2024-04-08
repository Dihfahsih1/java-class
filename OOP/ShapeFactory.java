

public class ShapeFactory{
    
    //Overloaded method to create a circle
    public Circle createCircle(double radius){
        return new Circle(radius);
    }
    //Overloaded method to create a Rectangle
    public Rectangle createRectangle(double length, double width){
        return new Rectangle(length, width);
    }

    public static void main(String[] args){
        ShapeFactory factory = new ShapeFactory();

        //creating different shapes using overloaded methods
        Circle circle=factory.createCircle(5.0);
        Rectangle rectangle=factory.createRectangle(4.5, 6.0);

        //Displaying details of each shape
        System.out.println("Circle: "+ circle.toString());
        System.out.println("Rectangle: "+ rectangle.toString());
    }
}

class Circle{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    // Method to get the circle details
    public String toString(){
        return "Circle with radius " +radius;
    }

}

class Rectangle{
    private double length;
    private double width;
    public Rectangle(double l, double w){
        this.length=l;
        this.width=w;
    }
    // Method to get the rectangle details
    public String toString(){
        return "Rectangle with length " +length +"and width "+width;
    }
}