#include<stdio.h>

void printArray( int *A, int n )
{
    printf("\nArray : ");
    for( int i = 0; i < n; i++ )
    {
        printf("%d ", A[i]);
        
    }
    printf("\n");
}

// void bubbleSort( int *A, int n )
// {
//     for (int i = 0; i < n - 1; i++)    // for number of pass
//     {
//         for (int j = 0; j < n - 1 - i; j++)     // for comparison in each pass
//         {
//             if( A[j] > A[j+1] )
//             {
//                 int temp = A[j];
//                 A[j] = A[j+1];
//                 A[j+1] = temp;
//             }
//         }
//     }    
// }

// It ensures that the loop doesn't iterate for already sorted array.
void bubbleSortAdaptive( int *A, int n )
{
    int isSorted = 0;
    for (int i = 0; i < n - 1; i++)    // for number of pass
    {
        printf("Working on pass number : %d\n", i+1);
        isSorted = 1;
        for (int j = 0; j < n - 1 - i; j++)     // for comparison in each pass
        {
            if( A[j] > A[j+1] )
            {
                int temp = A[j];
                A[j] = A[j+1];
                A[j+1] = temp;
                isSorted = 0;
            }
        }
        
        if( isSorted )
        {
            return; 
        }  
    }
    
}

int main()
{
    // int A[] = {12, 54, 65, 7, 23, 9};
    // int A[] = {1, 2, 3, 4, 5};
    int A[] = {1, 2, 3, 4, 5, 12, 54, 65, 7, 23, 9};   // <-- essm 1 to 5 ke liye compare nhi karega baakiyon ke liye kare
    int n = 11; // Size hai array ka

    printArray(A, n);

    bubbleSortAdaptive(A, n);

    printArray(A, n);
    printf("\n");

    return 0;
}