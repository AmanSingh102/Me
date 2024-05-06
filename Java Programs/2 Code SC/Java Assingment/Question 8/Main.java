// Q8. Write a Java program to print an array after changing the rows and columns of a two- dimensional array. 
// Original Array:
// 10 20 30
// 40 50 60
// After changing the rows and columns of the said array:
// 10 40
// 20 50
// 30 60

public class Main 
{
    public static void main(String[] args) 
    {
        int[][] originalArray = 
        {
            {10, 20, 30},
            {40, 50, 60}
        };

        int[][] changedArray = new int[originalArray[0].length][originalArray.length];

        for (int i = 0; i < originalArray.length; i++)
        {
            for (int j = 0; j < originalArray[0].length; j++) 
            {
                changedArray[j][i] = originalArray[i][j];
            }
        }

        System.out.println("Original Array ----");
        printArray(originalArray);
        System.out.println("Changed Arry ----");
        printArray(changedArray);
    }

    public static void printArray(int[][] arr) 
    {
        for (int[] row : arr) 
        {
            for (int val : row) 
            {
                System.out.print(val + " ");
            }

            System.out.println();
        }
    }
}

// Output :-

// Original Array ----
// 10 20 30      
// 40 50 60      

// Changed Arry ----
// 10 40         
// 20 50         
// 30 60    