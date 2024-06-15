import java.util.Scanner;

public class FibonaccSeries
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms : ");
        int num = sc.nextInt();
        sc.close();  
        
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println("Fibonacci Series till " + num + " terms : ");

        for(int i = 0; i < num; i++) 
        {
            System.out.print(firstTerm + " ");
            
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}