// Q11. Write a Java program to create an interface Shape with the getArea() method. 
// Create three classes Rectangle, Circle, and Triangle that implement the Shape interface. 
// Implement the getArea() method for each of the three class.

interface Shape 
{
    double getArea();
}

class Rectangle implements Shape 
{
    private double length;
    private double width;

    public Rectangle(double length, double width) 
    {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() 
    {
        return length * width;
    }
}

class Circle implements Shape
 {
    private double radius;

    public Circle(double radius) 
    {
        this.radius = radius;
    }

    @Override
    public double getArea() 
    {
        return Math.PI * radius * radius;
    }
}

class Triangle implements Shape 
{
    private double base;
    private double height;

    public Triangle(double base, double height) 
    {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() 
    {
        return 0.5 * base * height;
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Rectangle rectangle = new Rectangle(2, 3);
        Circle circle = new Circle(2);
        Triangle triangle = new Triangle(6, 2);

        System.out.println("Area of Rectangle: " + rectangle.getArea());
        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Area of Triangle: " + triangle.getArea());
    }
}

// Output :-
// Area of Rectangle: 6.0
// Area of Circle: 12.566370614359172
// Area of Triangle: 6.0