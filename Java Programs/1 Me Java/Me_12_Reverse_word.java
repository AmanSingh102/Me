import java.util.Scanner;

public class Me_12_Reverse_word 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

            System.out.print("\n -------- Reverse a Word ---------- \n");
            System.out.print("Enter one word : ");
            String inputWord = sc.nextLine();
            char[] str = inputWord.toCharArray();

            for( int i = str.length - 1; i >= 0; i-- )
            System.out.print(str[i]);

            
            System.out.print("\n\n ------ Reverse a sentence ---------- \n");
            System.out.print("Enter one word : ");
            String inputSentence = sc.nextLine();
            char[] str1 = inputSentence.toCharArray();

            for( int i = str1.length - 1; i >= 0; i-- )
            System.out.print(str1[i]);

        sc.close();
        
    }
    
}
