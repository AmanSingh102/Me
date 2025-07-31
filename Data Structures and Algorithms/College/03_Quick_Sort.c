// *Today's Outline: *
// Write a program in C language to accept 10 numbers from the user in an array and sort the array using Quick Sort with loop.

#include <stdio.h>

// Define the number of elements to be sorted
#define SIZE 10

// A utility function to swap two elements
void swap(int *a, int *b)
{
    int temp = *a;
    *a = *b;
    *b = temp;
}

/*
This function takes the last element as a pivot, places the pivot element at its
correct position in the sorted array, and places all smaller elements to the left
of the pivot and all greater elements to the right of the pivot.
This function contains the main loop for partitioning.
*/
int partition(int arr[], int low, int high)
{
    // Choose the last element as the pivot
    int pivot = arr[high];

    // Index of the smaller element
    int i = (low - 1);

    // Loop through the array from the first element (low) to the one before the pivot
    for (int j = low; j <= high - 1; j++)
    {
        // If the current element is smaller than the pivot
        if (arr[j] < pivot)
        {
            i++;                    // Increment the index of the smaller element
            swap(&arr[i], &arr[j]); // Swap the current element with the element at index i
        }
    }

    // After the loop, swap the pivot (arr[high]) into its correct position (i + 1)
    swap(&arr[i + 1], &arr[high]);

    // Return the partitioning index
    return (i + 1);
}

/*
The main function that implements QuickSort.
arr[] --> Array to be sorted,
low   --> Starting index,
high  --> Ending index
*/
void quickSort(int arr[], int low, int high)
{
    // Base case: if low is less than high, there is more than one element to sort
    if (low < high)
    {
        // pi is the partitioning index, arr[pi] is now at the right place
        int pi = partition(arr, low, high);

        // Separately sort elements before partition and after partition
        quickSort(arr, low, pi - 1);  // Recursive call for the left sub-array
        quickSort(arr, pi + 1, high); // Recursive call for the right sub-array
    }
}

// Function to print an array
void printArray(int arr[], int size)
{
    for (int i = 0; i < size; i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

// Main driver program
int main()
{
    int numbers[SIZE];

    // 1. Accept 10 numbers from the user
    printf("Please enter %d numbers:\n", SIZE);
    for (int i = 0; i < SIZE; i++)
    {
        printf("Enter number %d: ", i + 1);
        scanf("%d", &numbers[i]);
    }

    // 2. Display the original array
    printf("\nOriginal array: \n");
    printArray(numbers, SIZE);

    // 3. Sort the array using Quick Sort
    // The initial call sorts the entire array from index 0 to SIZE-1
    quickSort(numbers, 0, SIZE - 1);

    // 4. Display the sorted array
    printf("\nArray sorted with Quick Sort: \n");
    printArray(numbers, SIZE);

    return 0;
}