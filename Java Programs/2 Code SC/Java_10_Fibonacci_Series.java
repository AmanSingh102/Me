import java.util.Scanner;

public class Java_10_Fibonacci_Series
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

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
        
        sc.close();
    }
}
