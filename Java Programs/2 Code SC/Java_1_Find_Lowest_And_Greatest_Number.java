import java.util.Scanner;

public class Java_1_Find_Lowest_And_Greatest_Number
{
 public static void main(String[] args) 
 {
    Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter the First Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter the Third Number : ");
        int num3 = sc.nextInt();

        if( num1 < num2 && num1 < num3 )
        System.out.printf("%d is lowest",num1);
        else if( num2 < num1 && num2 < num3 )
        System.out.printf("%d is lowest",num2);
        else if( num3 < num1 && num3 < num2) 
        System.out.printf("%d is lowest",num3);
        else
        System.out.println("All numbers are Equal !!!!");

        System.out.println();
        if( num1 > num2 && num1 > num3 )
        System.out.printf("%d is greatest",num1);
        else if( num2 > num1 && num2 > num3 )
        System.out.printf("%d is greatest",num2);
        else if( num3 > num1 && num3 > num2) 
        System.out.printf("%d is greatest",num3);
        else
        System.out.println("All numbers are Equal !!!!");

    sc.close();
    
 }
    
}