// Q6. Write a program in Java to define a method Sum in a 
// class Calculation to return the addition of two integers
import java.util.Scanner;

public class Calculation 
{
    public int sum(int n1, int n2) 
    {
        return n1 + n2;
    }

    public static void main(String[] args) 
    {
        Calculation calculation = new Calculation();
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter 1st number : ");
            int num1 = sc.nextInt();
            System.out.print("Enter 2nd number : ");
            int num2 = sc.nextInt();
        sc.close();

        int result = calculation.sum(num1, num2);
        System.out.println("The sum is : " + result);
    }
}

// Output :-
// Enter 1st number : 2
// Enter 2nd number : 3
// The sum is : 5