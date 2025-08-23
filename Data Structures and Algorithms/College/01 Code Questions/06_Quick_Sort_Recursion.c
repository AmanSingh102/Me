#include <stdio.h>

// Function to swap two elements
void swap(int *a, int *b) 
{
    int temp = *a;
    *a = *b;
    *b = temp;
}

// Partition function for quicksort
int partition(int arr[], int low, int high) 
{
    int pivot = arr[high];  // choose last element as pivot
    int i = low - 1;

    for (int j = low; j < high; j++)
    {
        if (arr[j] <= pivot) 
        {
            i++;
            swap(&arr[i], &arr[j]);
        }
    }
    swap(&arr[i + 1], &arr[high]);
    return (i + 1);
}

// Recursive quicksort function
void quickSort(int arr[], int low, int high) 
{
    if (low < high) 
    {
        int pi = partition(arr, low, high);  // partition index
        quickSort(arr, low, pi - 1);         // sort left side
        quickSort(arr, pi + 1, high);        // sort right side
    }
}

// Function to display array
void display(int arr[], int n) 
{
    for (int i = 0; i < n; i++) 
    {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

// Main function
int main() {
    int arr[10], i;

    // Input array
    printf("\n------------------------------------------\n\n");
    printf("Enter 10 elements -------\n");
    for (i = 0; i < 10; i++)
    {
        printf("Enter %d element : ", i+1);
        scanf("%d", &arr[i]);
    }
    
    printf("\nOriginal Array\n");
    display(arr, 10);
    
    // Apply quick sort
    quickSort(arr, 0, 9);
    
    printf("\nSorted Array (Quick Sort)\n");
    display(arr, 10);
    
    printf("\n------------------------------------------\n\n");
    return 0;
}
