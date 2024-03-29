import java.util.Scanner;

public class Java_8_Methods_Overloading
{
    static void calculator( int a,int b,String t)
    {
        if(t.equals("+"))
        {
            System.out.println(a + b);
        }
        else if(t.equals("-"))
        {
            System.out.println(a - b);
        }
        else if(t.equals("*"))
        {
            System.out.println(a * b);
        }
        else if(t.equals("/"))
        {
            System.out.println(a / b);
        }
        else
        {
            System.out.println("Invalid Value !!!!!");
        }

    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st Number : ");
        int input1 = input.nextInt();
        System.out.print("Enter 2nd Number : ");
        int input2 = input.nextInt();
        System.out.print("Enter the Operator [ +, -, *, / ] : ");
        String operator = input.next();

        calculator(input1, input2, operator);

        input.close();
    }
    
}
