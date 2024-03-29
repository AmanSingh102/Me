public class Me_16_Reverse_Number_Pattern 
{
    public static void main(String[] args)
    {
        System.out.println("\n---- Here the Pattern ----");
        for(int i = 5; i>=0;i--)
        {
            for(int j=i;j>=0;j--)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    } 
    
}
