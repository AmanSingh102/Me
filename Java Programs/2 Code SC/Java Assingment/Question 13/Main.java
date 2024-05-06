// Q13. Write a Java program to create a method that takes an integer as a parameter and throws
// an exception if the number is odd.
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter an even number : ");
            int num = sc.nextInt();
        sc.close();

        try 
        {
            checkEvenNumber(num);
        } 
        catch (OddNumberException e) 
        {
            System.out.println("Caught an odd number exception: " + e.getMessage());
        }
    }

    public static void checkEvenNumber(int num) throws OddNumberException 
    {
        if (num % 2 != 0) 
        {
            throw new OddNumberException("Number is odd !");
        } 
        else 
        {
            System.out.println("Number is even.");
        }
    }
}

class OddNumberException extends Exception 
{
    public OddNumberException(String message) 
    {
        super(message);
    }
}

// Output :-
// Enter an even number : 2
// Number is even

// Enter an even number : 7
// Caught an odd number exception: Number is odd !