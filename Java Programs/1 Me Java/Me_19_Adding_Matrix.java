import java.util.Scanner;

public class Me_19_Adding_Matrix 
{
    public static void main(String[] args) 
    {
        Scanner sc  = new Scanner(System.in);

        int [][] arr = new int[3][3];
        int [][] arr2 = new int[3][3];

        System.out.println("\n---- Adding Of Matrix Program ----\n");

        for(int i = 0; i < 3; i++ )
        for(int j = 0; j < 3; j++ )
        {
            System.out.printf("Enter %d%d element : ",i+1,j+1);
            arr[i][j] = sc.nextInt();
        }

        System.out.println("\n---- Matirx 1 ----");
        for(int i = 0; i < 3; i++ )
        {
        for(int j = 0; j<3; j++ )
        {
            System.out.printf("%d\t",arr[i][j]);
        }
        System.out.println();
        }

        System.out.println();
        for(int i = 0; i < 3; i++ )
        for(int j = 0; j < 3; j++ )
        {
            System.out.printf("Enter %d%d element : ",i+1,j+1);
            arr2[i][j] = sc.nextInt();
        }

        System.out.println("\n---- Matirx 2 ----");
        for(int i = 0; i < 3; i++ )
        {
        for(int j = 0; j < 3; j++ )
        {
            System.out.printf("%d\t",arr2[i][j]);
        }
        System.out.println();
        }

        System.out.println("\n---- Adding of Matrix ----");
        for(int i = 0; i < 3; i++ )
        {
        for(int j = 0; j < 3; j++ )
        {
            System.out.printf("%d\t",arr[i][j] + arr2[i][j]);
        }
        System.out.println();
        }

        System.out.println("\n----- End of the Program -----");

        System.out.println();
        sc.close();
    }
}
