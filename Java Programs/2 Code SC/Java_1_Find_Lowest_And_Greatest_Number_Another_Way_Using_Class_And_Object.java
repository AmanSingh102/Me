import java.util.Scanner;

class Greatest_And_Smallest_Number
{
    
    void check( int[] num )
    {
        if( num[0] < num[1] && num[0] < num[2] )
        System.out.printf("%d is lowest number",num[0]);
        else if( num[1] < num[0] && num[1] < num[2] )
        System.out.printf("%d is lowest number",num[1]);
        else if( num[2] < num[0] && num[2] < num[1]) 
        System.out.printf("%d is lowest number",num[2]);
        else
        System.out.println("All numbers are Equal !!!!");

        System.out.println();
        if( num[0] > num[1] && num[0] > num[2] )
        System.out.printf("%d is greatest number",num[0]);
        else if( num[1] > num[0] && num[1] > num[2] )
        System.out.printf("%d is greatest number",num[1]);
        else if( num[2] > num[0] && num[2] > num[1]) 
        System.out.printf("%d is greatest number",num[2]);
        else
        System.out.println("All numbers are Equal !!!!");
    }
    
}

public class Java_1_Find_Lowest_And_Greatest_Number_Another_Way_Using_Class_And_Object 
{
    public static void main(String[] args) 
    {
        System.out.println("\n---- Greatest and Number Finder Program ----\n");
        
        Greatest_And_Smallest_Number start = new Greatest_And_Smallest_Number();

        Scanner sc = new Scanner(System.in);

            int[] num = new int[3];
            for( int i=0; i<3; i++)
            {
                System.out.printf("Enter %d numner : ",i+1);
                num[i] = sc.nextInt();
            }

            System.out.println("\nResult ------------------------>");
            start.check(num);

        sc.close();

        System.out.println("\n\n--------------------------------------------\n");
    }    
}
