#include <stdio.h>

int Binary_Search(int arr[], int size, int element)
{
    int low, mid, high;

    low = 0;
    high = size - 1;

    while (low <= high)
    {
        mid = (low + high) / 2;

        if (arr[mid] == element)
        {
            return mid;
        }
        if (arr[mid] < element)
        {
            low = mid + 1; 
        }
        else
        {
            high = mid - 1;
        }
    }
    return -1;
}

int main()
{
    // For binary searching array must be sorted okay bro
    int arr[] = {1, 2, 3, 56, 95, 97, 100, 255, 400};
    int size = sizeof(arr) / sizeof(int);
    int element = 56;

    int searchIndex = Binary_Search(arr, size, element);
    printf("The element %d was found at index %d\n", element, searchIndex);

    return 0;
}