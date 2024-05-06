// Q1. Write a program in Java to print the factorial of a number, accepted from the user
import java.util.Scanner;

public class Factorial 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number : ");
            int num = sc.nextInt();
        sc.close();

        long factorial = 1;
        for ( int i = 1; i <= num; i++ ) 
        {
            factorial *= i;
        }

        System.out.println("Factorial of " + num + " is " + factorial);
    }    
}


// Output :-
// Enter a number : 5
// Factorial of 5 is 120