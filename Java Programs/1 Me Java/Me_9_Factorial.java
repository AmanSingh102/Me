import java.util.Scanner;

public class Me_9_Factorial 
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int num,fact = 1;
            System.out.print("Enter the number : ");
            num = sc.nextInt();

            int temp = num;

            for(  ; num > 0; num-- )
            fact *= num;

            System.out.printf("Factorial of %d is %d",temp,fact);

        }

    }
    
}
