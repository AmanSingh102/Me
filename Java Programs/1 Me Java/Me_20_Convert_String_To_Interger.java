import java.util.Scanner;

public class Me_20_Convert_String_To_Interger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        String[] numberString = new String[5];
        for (int i = 0; i < 5; i++) 
        {
            System.out.printf("Enter %d number : ",i+1);
            numberString[i] = sc.nextLine();
        }
        
        int sum = 0;
        for ( int i = 0; i < 5; i++ ) 
        {
            Integer num = Integer.valueOf(numberString[i]);
            sum += num;
        }
        
        System.out.println("Sum of the numbers : " + sum);
        
        sc.close();
    }
}