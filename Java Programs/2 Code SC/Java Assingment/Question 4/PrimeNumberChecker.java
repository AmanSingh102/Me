// Q4. Write a program in Java to check whether an accepted number from the user is Prime or not
import java.util.Scanner;

public class PrimeNumberChecker 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number : ");
            int number = sc.nextInt();
        sc.close();
        
        boolean isPrime = true;
        if (number <= 1) 
        {
            isPrime = false;
        } 
        else 
        {
            for ( int i = 2; i <= Math.sqrt(number); i++ ) 
            {
                if (number % i == 0) 
                {
                    isPrime = false;
                    break;
                }
            }
        }
        
        if (isPrime) 
        {
            System.out.println(number + " is a prime number.");
        } 
        else 
        {
            System.out.println(number + " is not a prime number.");
        }
    }
}

// Output :-
// Enter a number : 12
// 12 is not a prime number.

// Output :-
// Enter a number : 17
// 17 is a prime number.
