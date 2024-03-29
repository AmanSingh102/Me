import java.util.Scanner;

public class Me_6_Armstrong_number 
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int n,r,temp,s=0;
            System.out.print("Enter the number : ");
            n = sc.nextInt();

            temp = n;
            while( temp > 0 )
            {
                r = temp % 10;
                s = s + ( r * r * r);
                temp = temp - r;
                temp = temp/10;
            }

            if( s == n )
                System.out.printf("%d is Armstrong number",n);
            else
                System.out.printf("%d is not an Arstrong number",n);
        }
    }
    
}
