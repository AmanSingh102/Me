// WAP in c language to multiple two matrices an array of dimensons 3x3
#include <stdio.h>

void display(int matrix[3][3]) 
{
    for (int i = 0; i < 3; i++) 
    {
        for (int j = 0; j < 3; j++) 
        {
            printf("%d\t", matrix[i][j]);
        }
        printf("\n");
    }
}

int main() 
{
    int a[3][3], b[3][3];
    int result[3][3] = {0}; // Initialize result matrix with 0
    int i, j, k;

    // Input first matrix
    printf("\n------------------------------------------\n\n");
    printf("Enter elements of first 3 X 3 matrix\n");
    for (i = 0; i < 3; i++) 
    {
        for (j = 0; j < 3; j++) 
        {
            printf("Enter element a[%d][%d] : ", i, j);
            scanf("%d", &a[i][j]);
        }
    }

    // Input second matrix
    printf("\nEnter elements of second 3 X 3 matrix\n");
    for (i = 0; i < 3; i++) 
    {
        for (j = 0; j < 3; j++) 
        {
            printf("Enter element b[%d][%d] : ", i, j);
            scanf("%d", &b[i][j]);
        }
    }

    printf("\nFirst Matrix\n");
    display(a);
    printf("\nSecond Matrix\n");
    display(b);

    // Matrix multiplication
    for (i = 0; i < 3; i++) 
    {
        for (j = 0; j < 3; j++) 
        {
            for (k = 0; k < 3; k++) 
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

// Enter elements of first 3 X 3 matrix
// Enter element a[0][0] : 1
// Enter element a[0][1] : 1
// Enter element a[0][2] : 1
// Enter element a[1][0] : 1
// Enter element a[1][1] : 1
// Enter element a[1][2] : 1
// Enter element a[2][0] : 1
// Enter element a[2][1] : 1
// Enter element a[2][2] : 1

// Enter elements of second 3 X 3 matrix
// Enter element b[0][0] : 1
// Enter element b[0][1] : 1
// Enter element b[0][2] : 1
// Enter element b[1][0] : 1
// Enter element b[1][1] : 1
// Enter element b[1][2] : 1
// Enter element b[2][0] : 1
// Enter element b[2][1] : 1
// Enter element b[2][2] : 1

// First Matrix
// 1       1       1
// 1       1       1
// 1       1       1

// Second Matrix
// 1       1       1
// 1       1       1
// 1       1       1

// Resultant Matrix (Multiplication)
// 3       3       3
// 3       3       3
// 3       3       3

// ------------------------------------------