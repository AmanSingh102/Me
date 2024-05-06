// Q12. Write a Java program to create a base class Animal (Animal Family) with a method called Sound(). 
// Create two subclasses Bird and Cat. 
// Override the Sound() method in each subclass to make a specific sound for each animal.

class Animal 
{
    public void sound() 
    {
        System.out.println("Animal makes a sound");
    }
}

class Bird extends Animal 
{
    @Override
    public void sound() 
    {
        System.out.println("Bird chirps");
    }
}

class Cat extends Animal 
{
    @Override
    public void sound() 
    {
        System.out.println("Cat meows");
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Cat cat = new Cat();
        
        animal.sound();
        bird.sound();
        cat.sound();
    }
}

// Output :-
// Animal makes a sound
// Bird chirps
// Cat meows