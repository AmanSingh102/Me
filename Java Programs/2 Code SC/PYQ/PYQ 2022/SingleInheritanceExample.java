class Animal
{
    void eat()
    {
        System.out.println("Eating.....");
    }
}

class Dog extends Animal
{
    void bark()
    {
        System.out.println("Barking.....");
    }
}

public class SingleInheritanceExample 
{
    public static void main(String[] args) 
    {
        Dog bullDog = new Dog();
        bullDog.bark();
        bullDog.eat();    
    }    
}
