import java.util.Scanner;

public class Me_5_Multiplication_Table 
{
    public static void main(String[] args)
    {
        try( Scanner sc = new Scanner(System.in))
        {
            int num,range;
            System.out.print("Enter the number : ");
            num = sc.nextInt();
            System.out.print("Enter the Range : ");
            int r = sc.nextInt();

            for(   ; num <= r; num++  ) {
            for( range = 1; range <= 10; range++ ) 
  
                System.out.printf("%d x %d = %d\n",num,range,num*range); 
                System.out.print("\n");

            }


        }
    } 
    
}
