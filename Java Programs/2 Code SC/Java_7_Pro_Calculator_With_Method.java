import java.util.Scanner;

public class Java_7_Pro_Calculator_With_Method 
{
    static float operation(String operator, float num1, float num2)
    {
        switch( operator )
        {
            case "+" : 
            return num1 + num2;

            case "-" :
            return num1 - num2;

            case "*" : 
            return num1 * num2;

            case "/" :
            return num1 / num2;

            default : 
            System.out.println("Invalid Operator !!!!");

        }
        return num1;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        float num1,anothernumber;
        String operator;

        System.out.print("Enter An Integer : ");
        num1 = sc.nextInt();
        
        while(true)
        {
            System.out.print("Enter the operator [ +, -, *, / ] : ");
            operator = sc.next();

            if( operator.equals("=")) { break ;}

            System.out.print("Enter another Integer : ");
            anothernumber = sc.nextInt();

            num1 = operation(operator, num1, anothernumber);
        }

        System.out.println("Solution is " + num1);

        sc.close();
      
    }
    
}
