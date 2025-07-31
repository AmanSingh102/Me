// Todays's Outline:
// Write a program in C language that accepts 10 integers from the user in an array of 10 elements.
// Sort the array using merge sort?

#include <stdio.h>
// Define the number of elements
#define N 10

// Function to merge two subarrays of arr[]
// First subarray is arr[left..mid]
// Second subarray is arr[mid+1..right]
void merge(int arr[], int left, int mid, int right)
{
    int i, j, k;

    // Calculate the size of the two temporary subarrays
    int n1 = mid - left + 1;
    int n2 = right - mid;

    // Create temporary arrays
    // VLA (Variable Length Array) is a C99 feature
    int L[n1], R[n2];

    // --- Step 1: Copy data to temporary arrays L[] and R[] ---
    for (i = 0; i < n1; i++)
        L[i] = arr[left + i];
    for (j = 0; j < n2; j++)
        R[j] = arr[mid + 1 + j];

    // --- Step 2: Merge the temp arrays back into arr[left..right] ---
    i = 0;    // Initial index of first subarray
    j = 0;    // Initial index of second subarray
    k = left; // Initial index of the merged subarray in the original array

    while (i < n1 && j < n2)
    {
        // Compare elements and place the smaller one into the correct position
        if (L[i] <= R[j])
        {
            arr[k] = L[i];
            i++;
        }
        else
        {
            arr[k] = R[j];
            j++;
        }
        k++;
    }

    // --- Step 3: Copy the remaining elements of L[], if there are any ---
    while (i < n1)
    {
        arr[k] = L[i];
        i++;
        k++;
    }

    // --- Step 4: Copy the remaining elements of R[], if there are any ---
    while (j < n2)
    {
        arr[k] = R[j];
        j++;
        k++;
    }
}

// Iterative (loop-based) Merge Sort function
void mergeSort(int arr[], int n)
{
    int current_size; // For the size of subarrays to be merged (1, 2, 4, 8...)
    int left_start;   // For picking the starting index of the left subarray

    // This loop implements the bottom-up strategy.
    // It merges subarrays of size 1, then size 2, then 4, and so on.
    for (current_size = 1; current_size <= n - 1; current_size = 2 * current_size)
    {

        // This loop picks the starting point of different subarrays to be merged
        for (left_start = 0; left_start < n - 1; left_start += 2 * current_size)
        {

            // Find the middle and right endpoints of the subarrays
            int mid = left_start + current_size - 1;
            int right_end = left_start + 2 * current_size - 1;

            // Make sure the right endpoint does not go out of bounds
            if (right_end > n - 1)
            {
                right_end = n - 1;
            }

            // Make sure the middle point is valid before calling merge
            // This condition is important for arrays with odd lengths or
            // for the last pair of subarrays in an iteration.
            if (mid < right_end)
            {
                merge(arr, left_start, mid, right_end);
            }
        }
    }
}

// Utility function to print an array
void printArray(int A[], int size)
{
    for (int i = 0; i < size; i++)
        printf("%d ", A[i]);
    printf("\n");
}

// Main driver function
int main()
{
    int arr[N];
    int i;

    // 1. Get input from the user
    printf("Enter %d integers:\n", N);
    for (i = 0; i < N; i++)
    {
        // Simple input validation can be added here
        scanf("%d", &arr[i]);
    }

    // 2. Print the original array
    printf("\nOriginal array: \n");
    printArray(arr, N);

    // 3. Call the sorting function
    mergeSort(arr, N);

    // 4. Print the sorted array
    printf("\nSorted array (using Merge Sort): \n");
    printArray(arr, N);

    return 0;
}