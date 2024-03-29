import java.util.Scanner;

class five_Programs
{
    Scanner sc = new Scanner(System.in);

    void SumOfNaturalNumbers()
    {
        System.out.println("---- Sum of Natural Numbers Program ----");

        int num;
        int sum = 0;
        System.out.print("Enter the Number : ");
        num = sc.nextInt();

        for( int i=1; i<=num; i++ )
        {
            sum = sum + i;
        }

        System.out.printf("Sum of the %d Natural Numbers is %d",num,sum);
    }

    void AddTwoNumbers()
    {
        System.out.println("---- Adding Two Numbers Program ----");

        int num1,num2;
        System.out.print("Enter 1st Number : ");
        num1 = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        num2 = sc.nextInt();

        System.out.printf("Sum of %d and %d is %d",num1,num2,num1 + num2);
    }

    void MultiplicationTable()
    {
        System.out.println("---- Print Multiplication Table Program ----");

        System.out.print("Enter the Number : ");
        int num = sc.nextInt();

        for( int i = 1; i<= 10; i++)
        System.out.printf("%d X %d = %d\n",num,i,num*i);      
    }

    void Fatorial()
    {
        System.out.println("---- Factorial Program ----");

        int num,fact=1;
        System.out.print("Enter the Number : ");
        num = sc.nextInt();
        
        int temp = num;

        for( ; num > 0; num--)
        fact = fact * num;

        System.out.printf("Factorial of %d is %d",temp,fact);     
    }

    void CheckEvenOdd()
    {
        System.out.println("---- Even and Odd Number Checker Program ----");
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        if( num % 2 == 0 )
        System.out.printf("%d is Even Number",num);
        else
        System.out.printf("%d is Odd Number",num);
    }
}

public class Java_4_Methods_and_Classes 
{
    public static void main(String[] args) 
    {
        Scanner uc = new Scanner(System.in);
  
            five_Programs program_1 = new five_Programs();
            five_Programs program_2 = new five_Programs();
            five_Programs program_3 = new five_Programs();
            five_Programs program_4 = new five_Programs();
            five_Programs program_5 = new five_Programs();
     
        
            String Menu = "1. Find the Sum of Natural Numbers\n" +
                          "2. Find the Sum of Two Numbers\n" +
                          "3. Write Multiplication Table\n" +
                          "4. Find Factorial of the Number\n" +
                          "5. Check Even and Odd Numbers";
 
            while(true) 
            {
                System.out.println("\n\n-------------- MENU ---------------");
                System.out.println(Menu);  
                System.out.println("\n-------------------------------------------");
                System.out.print("Enter your option and For EXIT Enter 0 : ");
                int option = uc.nextInt();
                System.out.println();

                if( option == 0)
                {
                    break;
                }

                switch( option ) 
                {
                    case 1:
                    program_1.SumOfNaturalNumbers();    
                    break;
                
                    case 2:
                    program_2.AddTwoNumbers();
                    break;

                    case 3:
                    program_3.MultiplicationTable();
                    break;

                    case 4:
                    program_4.Fatorial();
                    break;

                    case 5:
                    program_5.CheckEvenOdd();
                    break;

                    default:
                    System.out.println("Invalid Input !!!!");
                }
                
            }  
            
        uc.close();

    }   
}
