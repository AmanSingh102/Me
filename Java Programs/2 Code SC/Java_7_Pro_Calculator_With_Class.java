import java.util.Scanner;

class Calculator
{
    float operation(String operator, float num1, float num2)
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
}

public class Java_7_Pro_Calculator_With_Class
{
 
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Calculator calculate = new Calculator();

        float num1,anothernumber;
        String operator;

        System.out.print("\nEnter An Integer : ");
        num1 = sc.nextInt();
        
        while(true)
        {
            System.out.print("Enter the operator [ +, -, *, / ] and for stop [ = ] : ");
            operator = sc.next();

            if( operator.equals("=")) { break ;}

            System.out.print("Enter another Integer : ");
            anothernumber = sc.nextInt();

            num1 = calculate.operation(operator, num1, anothernumber);
        }

        System.out.println("Solution is " + num1);

        sc.close();
      
    }
}
