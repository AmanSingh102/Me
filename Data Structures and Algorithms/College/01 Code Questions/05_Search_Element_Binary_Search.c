#include <stdio.h>

int main() 
{
    printf("\n------------------------------------------\n\n");
    int arr[10], n = 10, i, key;
    int low, high, mid, found = 0;
    
    // Input array elements (must be sorted for binary search)
    printf("Enter 10 sorted elements\n");
    for (i = 0; i < n; i++)  
    {
        printf("Enter %d element : ", i+1);
        scanf("%d", &arr[i]);
    }
    
    // Input element to search
    printf("\nEnter the element to search : ");
    scanf("%d", &key);
    
    // Binary search logic
    low = 0;
    high = n - 1;
    
    while (low <= high) 
    {
        mid = (low + high) / 2;
        
        if (arr[mid] == key) 
        {
            printf("\nElement %d found at position %d (index %d).\n", key, mid + 1, mid);
            found = 1;
            break;
        } 
        else if (arr[mid] < key) 
        {
            low = mid + 1;   // search in right half
        } 
        else 
        {
            high = mid - 1;  // search in left half
        }
    }
    
    if (!found) 
    {
        printf("\nElement %d not found in the array.\n", key);
    }
    
    printf("\n------------------------------------------\n\n");
    return 0;
}

// Output
// ------------------------------------------

// Enter 10 sorted elements
// Enter 1 element : 1     
// Enter 2 element : 2
// Enter 3 element : 3
// Enter 4 element : 4
// Enter 5 element : 5
// Enter 6 element : 6
// Enter 7 element : 7
// Enter 8 element : 8
// Enter 9 element : 9
// Enter 10 element : 10

// Enter the element to search : 7

// Element 7 found at position 7 (index 6).

// ------------------------------------------