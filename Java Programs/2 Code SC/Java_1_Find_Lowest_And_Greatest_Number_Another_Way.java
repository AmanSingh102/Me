import java.util.Scanner;

public class Java_1_Find_Lowest_And_Greatest_Number_Another_Way
{
 public static void main(String[] args) 
 {
    Scanner sc = new Scanner(System.in);
    
        int[] num = new int[3];
        for( int i=0; i<3; i++)
        {
            System.out.printf("Enter %d number : ",i+1);
            num[i] = sc.nextInt();
        }

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

    sc.close();
    
 }
    
}
