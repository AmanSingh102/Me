#include <stdio.h>

void display(int matrix[2][2]) 
{
    for (int i = 0; i < 2; i++) 
    {
        for (int j = 0; j < 2; j++) 
        {
            printf("%d\t", matrix[i][j]);
        }
        printf("\n");
    }
}

int main() 
{
    int a[2][2], b[2][2];
    int result[2][2] = {0}; // Initialize result matrix with 0
    int i, j, k;

    printf("\n------------------------------------------\n\n");

    // Input first matrix
    printf("Enter elements of first 2 X 2 matrix\n");
    for (i = 0; i < 2; i++) 
    {
        for (j = 0; j < 2; j++) 
        {
            printf("Enter element a[%d][%d] : ", i, j);
            scanf("%d", &a[i][j]);
        }
    }

    // Input second matrix
    printf("\nEnter elements of second 2 X 2 matrix\n");
    for (i = 0; i < 2; i++) 
    {
        for (j = 0; j < 2; j++) 
        {
            printf("Enter element b[%d][%d] : ", i, j);
            scanf("%d", &b[i][j]);
        }
    }

    // Display entered matrices
    printf("\nFirst Matrix\n");
    display(a);
    printf("\nSecond Matrix\n");
    display(b);

    // Matrix multiplication
    for (i = 0; i < 2; i++) 
    {
        for (j = 0; j < 2; j++) 
        {
            for (k = 0; k < 2; k++) 
            {
                result[i][j] += a[i][k] * b[k][j];
            }
        }
    }

    // Display result matrix
    printf("\nResultant Matrix (Multiplication)\n");
    display(result);

    printf("\n------------------------------------------\n\n");
    return 0;
}

// Output  
// ------------------------------------------

// Enter elements of first 2 X 2 matrix
// Enter element a[0][0] : 1
// Enter element a[0][1] : 1
// Enter element a[1][0] : 1
// Enter element a[1][1] : 1

// Enter elements of second 2 X 2 matrix
// Enter element b[0][0] : 1
// Enter element b[0][1] : 1
// Enter element b[1][0] : 1
// Enter element b[1][1] : 1

// First Matrix
// 1       1   
// 1       1   

// Second Matrix
// 1       1
// 1       1

// Resultant Matrix (Multiplication)
// 2       2
// 2       2

// ------------------------------------------