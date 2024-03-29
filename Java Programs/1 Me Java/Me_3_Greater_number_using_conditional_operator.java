import java.util.Scanner;

public class Me_3_Greater_number_using_conditional_operator 
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int a,b;
            System.out.print("Enter 1st number : ");
            a = sc.nextInt();
            System.out.print("Enter 2nd number : ");
            b = sc.nextInt();

            int c = (a>b)?a:b;

            System.out.printf("Greater number is %d",c);
        }
    }
    
}
