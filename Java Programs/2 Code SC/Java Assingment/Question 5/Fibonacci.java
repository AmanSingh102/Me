// Q5. Write a program in Java to print the Fibonacci upto 10th term

public class Fibonacci 
{
    public static void main(String[] args) 
    {
        int n = 10;
        int a = 0, b = 1;

        System.out.println("Fibonacci series up to " + "10th term :");

        for (int i = 1; i <= n; i++) 
        {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}

// Output :-
// Fibonacci series up to 10th term :
// 0 1 1 2 3 5 8 13 21 34 