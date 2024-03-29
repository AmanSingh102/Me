import java.util.Scanner;

public class Me_13_Alphabet_Number_Triangle 
{
    public static void main(String[] args) 
    {
        char test = 'A';
        System.out.println("Integer form of A is " + (int)test);
        int test2 = 65;
        System.out.println("Character form of 65 is " + (char)(test2));
        
        System.out.println("\n ---- Main code Yaha se hai ---- \n");
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number : ");
            int num = sc.nextInt();
            
            for (int i = 1; i <= num; i++) 
            {
                if (i % 2 == 1)                     //odd me ye chalega                  
                {
                    for(int j = 1; j <= i; j++) 
                    {
                        System.out.print(j + " ");
                    }
                } 
                else                                //aur plus hokar even hone per ye chele ga
                {
                    char c = 'A';
                    for(int j = 1; j <= i; j++) 
                    {
                        System.out.print(c + " ");
                        c++;
                    }
                }
                
                System.out.println();        // ek bar loop chalne ke baad new line print karne ke liye
            }

        sc.close();
    }
}