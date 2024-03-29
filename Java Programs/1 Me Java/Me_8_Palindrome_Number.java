import java.util.Scanner;

public class Me_8_Palindrome_Number 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int n,t,r,rev = 0;
            System.out.print("Enter an integer : ");
            n = sc.nextInt();

            t = n;
            while( t > 0 )
            {
                r = t % 10;
                t = t - r;
                t = t / 10;
                rev = ( rev * 10 ) + r;
            }

            if( rev == n )
                System.out.printf("%d is Palindrome Number",n);
            else
                System.out.printf("%d is not Palindrome Number",n);

        }
        
    }
    
}
