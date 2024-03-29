class car
{
    String name;
    int model;
    float price;

    void setVal()
    {
        model = 2024;
        price = 10000f;
    }

    void show()
    {
        System.out.println("Model of " + name + " car is " + model);
        System.out.println("Price of " + name + " car is " + price);
    }

    car()                 // constructor with no argument
    {
        model = 2020;
        price = 5000f;
    }
    
    car(int x,float y)    // constructor with two argument 
    {
        model = x;
        price = y;
    }

    car(float y, int x)   // constructor with two argument
    {
        model = x;
        price = y;
    }
}


public class Java_3_Class_and_Constructor_Understanding 
{
    public static void main(String[] args) 
    {
        System.out.println("\n---- Simple Class implemetation ----");
        car bmw = new car();
        bmw.name = "BMW";
        bmw.setVal();
        bmw.show();

        System.out.println("\n---- Constructor with no argument ----");
        car alto = new car();
        alto.name = "Alto";    
        alto.show();

        System.out.println("\n---- Constructor with two argument one int and another float ----");
        car toto = new car(1234,80000f);   
        toto.name = "Toto"; 
        toto.show();

        System.out.println("\n---- Constructor with two argument one float and another int ----");
        car kia = new car(1000000f,7765);    
        kia.name = "Kia";
        kia.show();
        System.out.println();

    }
}