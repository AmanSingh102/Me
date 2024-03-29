import java.util.Scanner;

class Calculator
{
    Scanner sc = new Scanner(System.in);

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
}

public class Java_5_Calculator 
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

            switch( operator )
            {
                case "+" :
                calculate.Add(num1, num2);
                break;

                case "-" :
                calculate.Subtract(num1, num2);
                break;

                case "*" : 
                calculate.Multiplication(num1, num2);
                break;

                case "/" :
                calculate.Quotient(num1, num2);
                break;

                default : 
                System.out.println("Invalid Operator !!!!");
            } 
            
        sc.close();          
    }  
}
