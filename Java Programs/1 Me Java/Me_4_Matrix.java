import java.util.Scanner;

public class Me_4_Matrix 
{
    public static void main(String[] argv)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int[][] num = new int[3][3];
            int i,j;

            for( i=0; i<3; i++ )
            for( j=0; j<3; j++ ) { 
            System.out.printf("Enter %d%d element : ",i+1,j+1);
            num[i][j] = sc.nextInt();  }

            System.out.print("\n Matrix of 3 x 3 \n");
            for( i=0; i<3; i++ ) {
            for( j=0; j<3; j++ )
            System.out.printf("%d\t",num[i][j]);
            System.out.print("\n"); }

            System.out.println();
        }
    }
    
}
