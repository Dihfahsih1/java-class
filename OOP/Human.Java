public class Human {
    private String name;
    private int age;
    private double height;

    // First constructor
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Second constructor
    public Human(double height) {
        this.height = height;
    }

    // Method: speaking
    public void speaking() {
        System.out.println(name + " speaks.");
    }

    // Method: walk
    public void walk() {
        System.out.println(name + " walks.");
    }

    public static void main(String[] args) {
        // Creating an object using the second constructor
        Human human = new Human('',5.9); // For example, height is 5.9 feet
        human.speaking(); // Output: null speaks. (since name is not set, it will be null)
        human.walk(); // Output: null walks. (since name is not set, it will be null)
    }
}
