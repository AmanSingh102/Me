// Binary Search
// What is Binary Search?
// Binary search is an efficient algorithm for finding an item from a sorted list of items. It works by repeatedly dividing in half the portion of the list that could contain the item, until you've narrowed down the possible locations to just one.

// How Binary Search Works
// 1. Start with a Sorted List: Binary search requires the list to be sorted in ascending or descending order.
// 2. Find the Middle Element: Find the middle element of the list.
// 3. Compare the Target Element: Compare the target element with the middle element.
// 4. Repeat the Process: Repeat the process with the left or right half of the list, depending on whether the target element is less than or greater than the middle element.

// Example
// Let's say we have a sorted list of numbers: [1, 2, 3, 4, 5, 6, 7, 8, 9]. We want to find the number 5 using binary search.

// 1. Initial List: [1, 2, 3, 4, 5, 6, 7, 8, 9]
// 2. Middle Element: 5
// 3. Compare: Since 5 is equal to the middle element, we've found the target element.

// Another Example
// Let's say we have a sorted list of numbers: [1, 2, 3, 4, 5, 6, 7, 8, 9]. We want to find the number 7 using binary search.

// 1. Initial List: [1, 2, 3, 4, 5, 6, 7, 8, 9]
// 2. Middle Element: 5
// 3. Compare: Since 7 is greater than 5, we repeat the process with the right half of the list: [6, 7, 8, 9].
// 4. Middle Element: 7
// 5. Compare: Since 7 is equal to the middle element, we've found the target element.

// Benefits
// Binary search has several benefits:

// 1. Efficient: Binary search is much faster than linear search, especially for large lists.
// 2. Fast Search: Binary search has a time complexity of O(log n), making it suitable for large datasets.

// Program

#include <stdio.h>

int binarySearch(int arr[], int n, int target) {
    int left = 0;
    int right = n - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        // Check if the target element is at the mid index
        if (arr[mid] == target) {
            return mid;
        }
        // If the target element is less than the mid element, search in the left half
        if (arr[mid] > target) {
            right = mid - 1;
        }
        // If the target element is greater than the mid element, search in the right half
        else {
            left = mid + 1;
        }
    }
    // If the target element is not found, return -1
    return -1;
}

int main() {
    int arr[] = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
    int n = sizeof(arr) / sizeof(arr[0]);
    int target = 23;

    int result = binarySearch(arr, n, target);

    if (result == -1) {
        printf("Element not found in the array\n");
    } else {
        printf("Element found at index %d\n", result);
    }

    return 0;
}