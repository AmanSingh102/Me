import java.util.Scanner;

public class Java_2_Find_Sum_And_Average_Of_The_Student_And_Whether_Is_Pass_Or_Not
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

            
            System.out.print("Enter the name of the Student : ");
            String name = sc.nextLine();
            int sum = 0;
            int[] marks = new int[5];

            for(int i=0; i<5; i++ )
            {
                System.out.printf("Enter %d Subject : ",i+1);
                marks[i] = sc.nextInt();

                if( marks[i] > 100 )
                {   System.out.println("Input Error !!!!");
                    break; 
                }

                sum = sum + marks[i];
            }

            System.out.println("Total marks of the " + name + " is " + sum);
            float avg = sum/5;
            System.out.println("Percentage of the  " + name + " is " + avg + "%");

            if(avg >= 75)
            {
                System.out.println("Distinction");
            }
            else if( avg < 75 && avg >= 50)
            {
                System.out.println("Pass");
            }
            else
            {
                System.out.println("Fail !!!! ");
            }

        sc.close();        
    }
    
}