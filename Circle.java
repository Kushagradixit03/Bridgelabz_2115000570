import java.util.Scanner;

public class Circle {
    private double radius;

    public Circle() {
        this(1.0);  
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void display() {
        System.out.println("\nCircle Area:");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        Circle userCircle = new Circle(radius);

        userCircle.display();
    }
}
