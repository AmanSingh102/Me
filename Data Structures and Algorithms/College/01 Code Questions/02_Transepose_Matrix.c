// WAP in c language to transpose an array of dimenson 3x3
#include <stdio.h>

int main() 
{
    int a[3][3], transpose[3][3];
    int i, j;

    // Input matrix
    printf("\n------------------------------------------\n\n");
    printf("Enter elements of 3 X 3 matrix\n");
    for (i = 0; i < 3; i++) 
    {
        for (j = 0; j < 3; j++) 
        {   
            printf("Enter element a[%d][%d] : ", i, j);
            scanf("%d", &a[i][j]);
        }
    }
    
    // Display original matrix
    printf("\nOriginal Matrix:\n");
    for (i = 0; i < 3; i++) 
    {
        for (j = 0; j < 3; j++) 
        {
            printf("%d\t", a[i][j]);
        }
        printf("\n");
    }
    
    // Finding transpose
    for (i = 0; i < 3; i++) 
    {
        for (j = 0; j < 3; j++) 
        {
            transpose[j][i] = a[i][j];
        }
    }
    
    // Display transpose matrix
    printf("\nTranspose Matrix:\n");
    for (i = 0; i < 3; i++) 
    {
        for (j = 0; j < 3; j++) 
        {
            printf("%d\t", transpose[i][j]);
        }
        printf("\n");
    }
    
    printf("\n------------------------------------------\n\n");
    return 0;
}

// Output
// ------------------------------------------

// Enter elements of 3 X 3 matrix
// Enter element a[0][0] : 1     
// Enter element a[0][1] : 2
// Enter element a[0][2] : 3
// Enter element a[1][0] : 4
// Enter element a[1][1] : 5
// Enter element a[1][2] : 6
// Enter element a[2][0] : 7
// Enter element a[2][1] : 8
// Enter element a[2][2] : 9

// Original Matrix: 
// 1       2       3
// 4       5       6
// 7       8       9

// Transpose Matrix:
// 1       4       7
// 2       5       8
// 3       6       9

// ------------------------------------------