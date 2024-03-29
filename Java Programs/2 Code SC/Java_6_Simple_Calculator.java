import java.util.Scanner;

class Calculator
{
    void Add( float num1, float num2 )
    {
        System.out.printf("\n%f + %f = %f",num1,num2,num1 + num2);
        System.out.println("\n------------------------------------\n");
    }

    void Subtract( float num1, float num2 )
    {
        System.out.printf("\n%f - %f = %f",num1,num2,num1 - num2);
        System.out.println("\n------------------------------------\n");
    }

    void Multiplication( float num1, float num2 )
    {
        System.out.printf("\n%f * %f = %f",num1,num2,num1 * num2);
        System.out.println("\n------------------------------------\n");
    }

    void Quotient( float num1, float num2 )
    {

        if( num2 == 0 )
        {
            System.out.print("ERROR ---> you can't divide by zero or 0\n");
        }

        System.out.printf("\n%f / %f = %f",num1,num2,num1 / num2);
        System.out.println("\n------------------------------------\n");
    }

    void Operator( String operator, float num1, float num2 )
    {
        switch( operator )
        {
            case "+" :
            Add(num1, num2);
            break;

            case "-" :
            Subtract(num1, num2);
            break;

            case "*" : 
            Multiplication(num1, num2);
            break;

            case "/" :
            Quotient(num1, num2);
            break;

            default : 
            System.out.println("Invalid Operator !!!!");

        }
    }    
}

public class Java_6_Simple_Calculator 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        Calculator calculate = new Calculator();

        String choice = "1. For Addition       : Enter [ + ]\n" + 
                        "2. For Subtraction    : Enter [ - ]\n" +
                        "3. For Multiplication : Enter [ * ]\n" +
                        "4. For Division       : Enter [ / ]\n";

            System.out.println();
            System.out.println("--------- Simple Calulator ---------");
            System.out.println(choice);

            System.out.print("Enter your 1st Number : ");
            float num1 = sc.nextFloat();
            
            System.out.print("Enter Your Operator : ");
            String operator = sc.next();

            System.out.print("Enter your 2nd Number : ");
            float num2 = sc.nextFloat();

            calculate.Operator(operator,num1,num2);
            
        sc.close();          
    }  
}
