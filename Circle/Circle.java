package Circle;
import java.util.Scanner;

public class Circle 
{
    private double radius;
    private double area;
    private final double PI = 3.14159; // PI as a constant

    public void acceptRadius() 
    {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();
        scanner.close();
    }

    public void calculateArea() 
    {
        area = PI * radius * radius;
    }

    public void displayArea() 
    {
        System.out.println("The area of the circle is: " + area);
    }

    public static void main(String[] args) 
    {
        Circle circle = new Circle(); //Creating Object
        circle.acceptRadius();
        circle.calculateArea(); //Calling method through object as a reference.
        circle.displayArea();
    }
}
