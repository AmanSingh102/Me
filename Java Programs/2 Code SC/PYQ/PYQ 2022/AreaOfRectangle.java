public class AreaOfRectangle 
{
    int length;
    int breadth;

    AreaOfRectangle( int l, int b)
    {
        this.length = l;
        this.breadth = b;
    }

    void displayArea()
    {
        System.out.println("Area of the Rectangle : " + ( length * breadth ));
    }
    public static void main(String[] args) 
    {
        AreaOfRectangle rectangle = new AreaOfRectangle(5, 7);
        rectangle.displayArea();
    }    
}
