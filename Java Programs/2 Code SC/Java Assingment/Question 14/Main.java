// Q14. Write a Java program that creates two threads to 
// find and print even and odd numbers from 1 to 20.

public class Main 
{
    public static void main(String[] args) 
    {
        Thread evenThread = new Thread(new EvenPrinter());
        Thread oddThread = new Thread(new OddPrinter());

        evenThread.start();
        oddThread.start();
    }
}

class EvenPrinter implements Runnable 
{
    @Override
    public void run() 
    {
        for (int i = 2; i <= 20; i += 2) 
        {
            System.out.println("Even : " + i);
        }
    }
}

class OddPrinter implements Runnable 
{
    @Override
    public void run() 
    {
        for (int i = 1; i <= 20; i += 2) 
        {
            System.out.println("Odd : " + i);
        }
    }
}

// Output :-
// Odd : 1
// Odd : 3  
// Even : 2 
// Even : 4 
// Even : 6 
// Odd : 5  
// Even : 8 
// Even : 10
// Even : 12
// Odd : 7
// Even : 14
// Odd : 9
// Odd : 11
// Even : 16
// Odd : 13
// Even : 18
// Odd : 15
// Even : 20
// Odd : 17
// Odd : 19