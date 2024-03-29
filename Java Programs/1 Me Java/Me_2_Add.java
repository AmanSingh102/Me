import java.util.Scanner;

public class Me_2_Add 
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.print("Enter your 1st number : ");
            int a = sc.nextInt();

            System.out.print("Enter your 2nd number : ");
            int b = sc.nextInt();

            int sum = a + b;

            System.out.printf("Sum is %d",sum);
        }    
         
    }
    
}
