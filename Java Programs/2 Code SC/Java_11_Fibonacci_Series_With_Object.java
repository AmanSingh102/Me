import java.util.Scanner;

class Fibonacci
{
    Scanner sc = new Scanner(System.in);
    void fibo()
    {
        
        int n;
        int first_number = 0;
        int second_number = 1;

        System.out.println("---- Fibonacci Series Program ----");

        System.out.print("Enter the number : ");
        n = sc.nextInt();


        for( int i = 1; i<=n; i++ )
        {
            System.out.print( first_number + " " );

            int next_number = first_number + second_number;
            first_number = second_number;
            second_number = next_number;
        }
    }
   
}

public class Java_11_Fibonacci_Series_With_Object 
{
    public static void main(String[] args) 
    {
       Fibonacci start = new Fibonacci();
       start.fibo();
       
    }
}
