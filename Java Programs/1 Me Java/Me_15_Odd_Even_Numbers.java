import java.util.Scanner;

public class Me_15_Odd_Even_Numbers 
{
    public static void main(String[] args) 
    {
         Scanner sc = new Scanner(System.in);

            System.out.print("Enter the Number : ");
            int num  = sc.nextInt();

            if( num % 2 == 0 )
            {
                System.out.printf("%d is Even Number",num);

                System.out.print("\n" + num + " Even Numbers are : ");
                for( int i = 1; i<=num; i++ )
                {
                    System.out.print(2*i + " ");
                }
            }
            else
            {
                System.out.printf("%d is Odd Number",num);
                
                System.out.print("\n" + num + " Odd Numbers are : ");
                for( int i = 1; i<=num; i++ )
                {
                    System.out.print(2*i+1 + " ");
                }
            }
            
        sc.close();
    }
    
}
