import java.util.Scanner;

public class Me_10_Linear_Sorting 
{
    public static void main(String[] argv)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int[] sort = { 101,-90,54,1,-99 };
            int i,j;
            int temp;

            for( i=0 ; i<5; i++ ) 
            {
                for( j = i+1; j<5; j++) 
                {
                    if( sort[i] > sort[j] )
                    {
                        temp = sort[i];
                        sort[i] = sort[j];
                        sort[j] = temp;
                    }
                }
            }
            
            System.out.print("Sorted array is \n");
            for( i=0; i<5; i++ )
            System.out.printf("%d\t",sort[i]);
        }
    }
    
}
