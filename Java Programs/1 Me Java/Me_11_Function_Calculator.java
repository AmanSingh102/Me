import java.util.Scanner;

public class Me_11_Function_Calculator 
{

    public static void add(int x,int y)
    {
        int sum = x + y;
        System.out.printf("\nSum = %d\n",sum);
    }   

    public static void subtract(int x,int y)
    {
        int subtract = x - y;
        System.out.printf("Difference = %d\n",subtract);
    }
    
    public static void multiplication(int x,int y)
    {
        int multiplication = x * y;
        System.out.printf("Multiplication = %d\n",multiplication);
    }  

    public static void division(int x,int y)
    {
        int division = x / y;
        System.out.printf("Quotient = %d\n",division);
    } 
    
    public static void modulo(int x,int y)
    {
        int modulo = x % y;
        System.out.printf("Remainder = %d\n\n",modulo);
    }  
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter 1st number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int b = sc.nextInt();

        add(a, b);
        subtract(a, b);
        multiplication(a, b);
        division(a, b);
        modulo(a, b);

        sc.close();
        
    }
    
}
