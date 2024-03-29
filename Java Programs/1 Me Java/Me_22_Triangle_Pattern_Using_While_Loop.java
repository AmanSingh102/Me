import java.util.Scanner;

public class Me_22_Triangle_Pattern_Using_While_Loop 
{
    public static void main(String[] args) 
    {
        System.out.println("\n---- Triangle Pattern ----\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range : ");
        int range = sc.nextInt();

        System.out.println();
        int rows = 0;
        while( rows < range )
        {
            System.out.print("*\t");

            int i = 0;
            while( i < rows ) 
            {
                System.out.print("*\t");   
                i++;
            }

            System.out.println();
            rows++;
        }

        System.out.println("\n---------------------------\n");
        sc.close();
    }
}
