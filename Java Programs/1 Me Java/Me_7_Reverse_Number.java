import java.util.Scanner;

public class Me_7_Reverse_Number 
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int n,t,r,rev=0;
            System.out.print("Enter the number : ");
            n = sc.nextInt();

            t = n;
            while( t > 0 )
            {
                r = t % 10;
                t = t - r;
                t = t / 10;
                rev = ( rev * 10) + r;
            } 

            System.out.printf("Reverse of %d is %d",n,rev);
        }
    }
    
}
